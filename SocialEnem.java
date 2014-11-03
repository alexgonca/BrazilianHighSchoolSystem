import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;

import java.io.*;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: redacao
 * Date: 27/06/12
 * Time: 01:58
 * To change this template use File | Settings | File Templates.
 */
public class SocialEnem {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/educa";
        String user = "root";
        String password = "";
        String arquivoXML = ".\\src\\condicaosocial.xml";
        String arquivoTXT = ".\\src\\QUESTIONARIO_SOCIO_ECONOMICO_ENEM_2010.txt";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        ConfigurationReader parser = new ConfigurationReader();

        try {
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement(
                    "INSERT INTO socialenem2010(" +
                            "NU_INSCRICAO, IN_QSE,"+
                            "Q01, Q02, Q03, Q04, Q05, Q06, Q07, Q08, Q09, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, "+
                            "Q21, Q22, Q23, Q24, Q25, Q26, Q27, Q28, Q29, Q30, Q31, Q32, Q33, Q34, Q35, Q36, Q37, Q38, Q39, Q40, "+
                            "Q41, Q42, Q43, Q44, Q45, Q46, Q47, Q48, Q49, Q50, Q51, Q52, Q53, Q54, Q55, Q56, Q57) VALUES "+
                            " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "+
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
            int j = 0;
            /*while (((results = ff.getNextRecord(bufIn)) != null) && (i <= 499382)) {
                i++;
                System.out.println(i);
            } */

            while ((results = ff.getNextRecord(bufIn)) != null) {
               CondicaoSocial2010 e = (CondicaoSocial2010) results.getBean("condicaosocial");

               //System.out.println(e.getIdade());
               pst.setLong(1, e.getNumeroInscricao());
               pst.setString(2,  e.getInQse());
               pst.setString(3,  e.getQ01());
               pst.setString(4,  e.getQ02());
               pst.setString(5,  e.getQ03());
               pst.setString(6,  e.getQ04());
               pst.setString(7,  e.getQ05());
               pst.setString(8,  e.getQ06());
               pst.setString(9,  e.getQ07());
               pst.setString(10, e.getQ08());
               pst.setString(11, e.getQ09());
               pst.setString(12, e.getQ10());
               pst.setString(13, e.getQ11());
               pst.setString(14, e.getQ12());
               pst.setString(15, e.getQ13());
               pst.setString(16, e.getQ14());
               pst.setString(17, e.getQ15());
               pst.setString(18, e.getQ16());
               pst.setString(19, e.getQ17());
               pst.setString(20, e.getQ18());
               pst.setString(21, e.getQ19());
               pst.setString(22, e.getQ20());
               pst.setString(23, e.getQ21());
               pst.setString(24, e.getQ22());
               pst.setString(25, e.getQ23());
               pst.setString(26, e.getQ24());
               pst.setString(27, e.getQ25());
               pst.setString(28, e.getQ26());
               pst.setString(29, e.getQ27());
               pst.setString(30, e.getQ28());
               pst.setString(31, e.getQ29());
               pst.setString(32, e.getQ30());
               pst.setString(33, e.getQ31());
               pst.setString(34, e.getQ32());
               pst.setString(35, e.getQ33());
               pst.setString(36, e.getQ34());
               pst.setString(37, e.getQ35());
               pst.setString(38, e.getQ36());
               pst.setString(39, e.getQ37());
               pst.setString(40, e.getQ38());
               pst.setString(41, e.getQ39());
               pst.setString(42, e.getQ40());
               pst.setString(43, e.getQ41());
               pst.setString(44, e.getQ42());
               pst.setString(45, e.getQ43());
               pst.setString(46, e.getQ44());
               pst.setString(47, e.getQ45());
               pst.setString(48, e.getQ46());
               pst.setString(49, e.getQ47());
               pst.setString(50, e.getQ48());
               pst.setString(51, e.getQ49());
               pst.setString(52, e.getQ50());
               pst.setString(53, e.getQ51());
               pst.setString(54, e.getQ52());
               pst.setString(55, e.getQ53());
               pst.setString(56, e.getQ54());
               pst.setString(57, e.getQ55());
               pst.setString(58, e.getQ56());
               pst.setString(59, e.getQ57());

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
