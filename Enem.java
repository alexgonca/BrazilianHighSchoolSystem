import java.io.*;
import java.sql.*;
import java.util.HashMap;
import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;

public class Enem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/educa";
        String user = "root";
        String password = "";
        String arquivoXML = ".\\src\\inscritosenem2010.xml";
        String arquivoTXT = ".\\src\\DADOS_ENEM_2010.txt";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        ConfigurationReader parser = new ConfigurationReader();

        try {
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement(
                    "INSERT INTO provaenem2010(" +
                    "NU_INSCRICAO, NU_ANO, IDADE, TP_SEXO, COD_MUNIC_INSC, NO_MUNICIPIO_INSC, UF_INSC, ST_CONCLUSAO, IN_TP_ENSINO,"+
                    "IN_CERTIFICADO, IN_BRAILLE, IN_AMPLIADA, IN_LEDOR, IN_ACESSO, IN_TRANSCRICAO, IN_LIBRAS, IN_UNIDADE_PRISIONAL,"+
                    "IN_BAIXA_VISAO, IN_CEGUEIRA, IN_DEFICIENCIA_AUDITIVA, IN_DEFICIENCIA_FISICA, IN_DEFICIENCIA_MENTAL, IN_DEFICIT_ATENCAO,"+
                    "IN_DISLEXIA, IN_GESTANTE, IN_LACTANTE, IN_LEITURA_LABIAL, IN_SABATISTA, IN_SURDEZ, TP_ESTADO_CIVIL, TP_COR_RACA,"+
                    "PK_COD_ENTIDADE, COD_MUNICIPIO_ESC, NO_MUNICIPIO_ESC, UF_ESC, ID_DEPENDENCIA_ADM, ID_LOCALIZACAO, SIT_FUNC,"+
                    "COD_MUNICIPIO_PROVA, NO_MUNICIPIO_PROVA, UF_CIDADE_PROVA, IN_PRESENCA_CN, IN_PRESENCA_CH, IN_PRESENCA_LC,"+
                    "IN_PRESENCA_MT, NU_NT_CN, NU_NT_CH, NU_NT_LC, NU_NT_MT, TX_RESPOSTAS_CN, TX_RESPOSTAS_CH, TX_RESPOSTAS_LC,"+
                    "TX_RESPOSTAS_MT, ID_PROVA_CN, ID_PROVA_CH, ID_PROVA_LC, ID_PROVA_MT, TP_LINGUA, DS_GABARITO_CN, DS_GABARITO_CH,"+
                    "DS_GABARITO_LC, DS_GABARITO_MT, IN_STATUS_REDACAO, NU_NOTA_COMP1, NU_NOTA_COMP2, NU_NOTA_COMP3, NU_NOTA_COMP4,"+
                    "NU_NOTA_COMP5, NU_NOTA_REDACAO) VALUES" +
                  " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
                    "?, ?, ?, ?, ?, ?, ?, ?, ?)");

            FileFormat ff = parser.loadConfigurationFile(arquivoXML);
            InputStream in = new FileInputStream(arquivoTXT);
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));
            MatchedRecord results;
            int i = 0;

            while ((results = ff.getNextRecord(bufIn)) != null) {
                InscritoEnem2010 e = (InscritoEnem2010) results.getBean("inscrito");

                pst.setLong(1, e.getNumeroInscricao());
                pst.setInt (2,  e.getAno());
                pst.setInt(3,  e.getIdade());
                pst.setString(4,  e.getSexo());
                pst.setInt(5,  e.getCodMunicInsc());
                pst.setString(6,  e.getNomeMunicInsc());
                pst.setString(7,  e.getUfInsc());
                pst.setInt(8,  e.getStConclusao());
                pst.setInt(9,  e.getTipoEnsino());
                pst.setInt(10, e.getInCertificado());

                pst.setInt(11, e.getInBraille());
                pst.setInt(12, e.getInAmpliada());
                pst.setInt(13, e.getInLedor());
                pst.setInt(14, e.getInAcesso());
                pst.setInt(15, e.getInTranscricao());
                pst.setInt(16, e.getInLibras());
                pst.setInt(17, e.getInUnidPrisional());
                pst.setInt(18, e.getInBaixaVisao());
                pst.setInt(19, e.getInCegueira());
                pst.setInt(20, e.getInDefAuditiva());

                pst.setInt(21, e.getInDefFisica());
                pst.setInt(22, e.getInDefMental());
                pst.setInt(23, e.getInDeficitAtenc());
                pst.setInt(24, e.getInDislexia());
                pst.setInt(25, e.getInGestante());
                pst.setInt(26, e.getInLactante());
                pst.setInt(27, e.getInLeituraLabial());
                pst.setInt(29, e.getInSabatista());
                pst.setInt(28, e.getInSurdez());
                pst.setInt(30, e.getEstadoCivil());

                pst.setInt(31, e.getCorRaca());
                pst.setInt(32, e.getCodEscola());
                pst.setInt(33, e.getCodMunicEscola());
                pst.setString(34, e.getNomeMunicEscola());
                pst.setString(35, e.getUfEscola());
                pst.setInt(36,  e.getDependAdmEscola());
                pst.setInt(37,  e.getLocalizacEscola());
                pst.setInt(38,  e.getSitFuncEscola());
                pst.setInt(39,  e.getCodMunicProva());
                pst.setString(40, e.getNomeMunicProva());

                pst.setString(41, e.getUfMunicProva());
                pst.setInt(42, e.getPresCiencNatur());
                pst.setInt(43, e.getPresCiencHuman());
                pst.setInt(44, e.getPresLinguagens());
                pst.setInt(45, e.getPresMatematica());
                pst.setDouble(46, e.getNotaCiencNatur());
                pst.setDouble(47, e.getNotaCiencHuman());
                pst.setDouble(48, e.getNotaLinguagens());
                pst.setDouble(49, e.getNotaMatematica());
                pst.setString(50, e.getRespCiencNatur());

                pst.setString(51, e.getRespCiencHuman());
                pst.setString(52, e.getRespLinguagens());
                pst.setString(53, e.getRespMatematica());
                pst.setInt(54, e.getIdProvaCiencNat());
                pst.setInt(55, e.getIdProvaCiencHum());
                pst.setInt(56,  e.getIdProvaLinguage());
                pst.setInt(57,  e.getIdProvaMatemat());
                pst.setInt(58,  e.getTpLingua());
                pst.setString(59,  e.getGabaCiencNatur());
                pst.setString(60, e.getGabaCiencHuman());

                pst.setString(61, e.getGabaLinguagens());
                pst.setString(62, e.getGabaMatematica());
                pst.setString(63, e.getSituacaoRedacao());
                pst.setDouble(64, e.getNotaCompet1());
                pst.setDouble(65, e.getNotaCompet2());
                pst.setDouble(66, e.getNotaCompet3());
                pst.setDouble(67, e.getNotaCompet4());
                pst.setDouble(68, e.getNotaCompet5());
                pst.setDouble(69, e.getNotaRedacao());

                pst.executeUpdate();
                i++;
                System.out.println(i);
            }
        } catch (FlatwormUnsetFieldValueException flatwormUnsetFieldValueError) {
            flatwormUnsetFieldValueError.printStackTrace();
        } catch (FlatwormConfigurationValueException flatwormConfigurationValueError) {
            flatwormConfigurationValueError.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FlatwormInvalidRecordException e) {
            e.printStackTrace();
        } catch (FlatwormInputLineLengthException e) {
            e.printStackTrace();
        } catch (FlatwormConversionException e) {
            e.printStackTrace();
        } catch (FlatwormCreatorException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
