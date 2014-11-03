public class InscritoEnem2010 {
    private long NumeroInscricao = 0;
    private int Ano = 2010;
    private int Idade = 0;
    private String Sexo;
    private int CodMunicInsc = 0;
    private String NomeMunicInsc;
    private String UfInsc;
    private int StConclusao;
    private int TipoEnsino;
    private int InCertificado;
    private int InBraille;
    private int InAmpliada;
    private int InLedor;
    private int InAcesso;
    private int InTranscricao;
    private int InLibras;
    private int InUnidPrisional;
    private int InBaixaVisao;
    private int InCegueira;
    private int InDefAuditiva;
    private int InDefFisica;
    private int InDefMental;
    private int InDeficitAtenc;
    private int InDislexia;
    private int InGestante;
    private int InLactante;
    private int InLeituraLabial;
    private int InSabatista;
    private int InSurdez;
    private int EstadoCivil;
    private int CorRaca;
    private int CodEscola;
    private int CodMunicEscola;
    private String NomeMunicEscola;
    private String UfEscola;
    private int DependAdmEscola;
    private int LocalizacEscola;
    private int SitFuncEscola;
    private int CodMunicProva;
    private String NomeMunicProva;
    private String UfMunicProva;
    private int PresCiencNatur;
    private int PresCiencHuman;
    private int PresLinguagens;
    private int PresMatematica;
    private double NotaCiencNatur = 0.0;
    private double NotaCiencHuman = 0.0;
    private double NotaLinguagens = 0.0;
    private double NotaMatematica = 0.0;
    private String RespCiencNatur;
    private String RespCiencHuman;
    private String RespLinguagens;
    private String RespMatematica;
    private int IdProvaCiencNat;
    private int IdProvaCiencHum;
    private int IdProvaLinguage;
    private int IdProvaMatemat;
    private int TpLingua;
    private String GabaCiencNatur = "";
    private String GabaCiencHuman = "";
    private String GabaLinguagens = "";
    private String GabaMatematica = "";
    private String SituacaoRedacao = "X";
    private double NotaCompet1 = 0.0;
    private double NotaCompet2 = 0.0;
    private double NotaCompet3 = 0.0;
    private double NotaCompet4 = 0.0;
    private double NotaCompet5 = 0.0;
    private double NotaRedacao = 0.0;

    public void setNumeroInscricao (long aux) {
        NumeroInscricao = aux;
    }

    public long getNumeroInscricao () {
        return NumeroInscricao;
    }

    public void setAno (int aux) {
        Ano = aux;
    }

    public int getAno () {
        return Ano;
    }

    public void setIdade (int aux) {
        Idade = aux;
    }

    public int getIdade () {
        return Idade;
    }

    public void setSexo (String aux) {
        Sexo = aux;
    }

    public String getSexo () {
        return Sexo;
    }

    public void setCodMunicInsc (int aux) {
        CodMunicInsc = aux;
    }

    public int getCodMunicInsc () {
        return CodMunicInsc;
    }

    public void setNomeMunicInsc (String aux) {
        NomeMunicInsc = aux;
    }

    public String getNomeMunicInsc () {
        return NomeMunicInsc;
    }

    public void setUfInsc (String aux) {
        UfInsc = aux;
    }

    public String getUfInsc () {
        return UfInsc;
    }

    public void setStConclusao (int aux) {
        StConclusao = aux;
    }

    public int getStConclusao () {
        return StConclusao;
    }

    public void setTipoEnsino (int aux) {
        TipoEnsino = aux;
    }

    public int getTipoEnsino () {
        return TipoEnsino;
    }

    public void setInCertificado (int aux) {
        InCertificado = aux;
    }

    public int getInCertificado () {
        return InCertificado;
    }

    public void setInBraille (int aux) {
        InBraille = aux;
    }

    public int getInBraille () {
        return InBraille;
    }

    public void setInAmpliada (int aux) {
        InAmpliada = aux;
    }

    public int getInAmpliada () {
        return InAmpliada;
    }

    public void setInLedor (int aux) {
        InLedor = aux;
    }

    public int getInLedor () {
        return InLedor;
    }

    public void setInAcesso (int aux) {
        InAcesso = aux;
    }

    public int getInAcesso () {
        return InAcesso;
    }

    public void setInTranscricao (int aux) {
        InTranscricao = aux;
    }

    public int getInTranscricao () {
        return InTranscricao;
    }

    public void setInLibras (int aux) {
        InLibras = aux;
    }

    public int getInLibras () {
        return InLibras;
    }

    public void setInUnidPrisional (int aux) {
        InUnidPrisional = aux;
    }

    public int getInUnidPrisional () {
        return InUnidPrisional;
    }

    public void setInBaixaVisao (int aux) {
        InBaixaVisao = aux;
    }

    public int getInBaixaVisao () {
        return InBaixaVisao;
    }

    public void setInCegueira (int aux) {
        InCegueira = aux;
    }

    public int getInCegueira () {
        return InCegueira;
    }

    public void setInDefAuditiva (int aux) {
        InDefAuditiva = aux;
    }

    public int getInDefAuditiva () {
        return InDefAuditiva;
    }

    public void setInDefFisica (int aux) {
        InDefFisica = aux;
    }

    public int getInDefFisica () {
        return InDefFisica;
    }

    public void setInDefMental (int aux) {
        InDefMental = aux;
    }

    public int getInDefMental () {
        return InDefMental;
    }

    public void setInDeficitAtenc (int aux) {
        InDeficitAtenc = aux;
    }

    public int getInDeficitAtenc () {
        return InDeficitAtenc;
    }

    public void setInDislexia (int aux) {
        InDislexia = aux;
    }

    public int getInDislexia () {
        return InDislexia;
    }

    public void setInGestante (int aux) {
        InGestante = aux;
    }

    public int getInGestante () {
        return InGestante;
    }

    public void setInLactante (int aux) {
        InLactante = aux;
    }

    public int getInLactante () {
        return InLactante;
    }

    public void setInLeituraLabial (int aux) {
        InLeituraLabial = aux;
    }

    public int getInLeituraLabial () {
        return InLeituraLabial;
    }

    public void setInSurdez (int aux) {
        InSurdez = aux;
    }

    public int getInSurdez () {
        return InSurdez;
    }

    public void setInSabatista (int aux) {
        InSabatista = aux;
    }

    public int getInSabatista () {
        return InSabatista;
    }

    public void setEstadoCivil (int aux) {
        EstadoCivil = aux;
    }

    public int getEstadoCivil () {
        return EstadoCivil;
    }

    public void setCorRaca (int aux) {
        CorRaca = aux;
    }

    public int getCorRaca () {
        return CorRaca;
    }

    public void setCodEscola (int aux) {
        CodEscola = aux;
    }

    public int getCodEscola () {
        return CodEscola;
    }

    public void setCodMunicEscola (int aux) {
        CodMunicEscola = aux;
    }

    public int getCodMunicEscola () {
        return CodMunicEscola;
    }

    public void setNomeMunicEscola (String aux) {
        NomeMunicEscola = aux;
    }

    public String getNomeMunicEscola () {
        return NomeMunicEscola;
    }

    public void setUfEscola (String aux) {
        UfEscola = aux;
    }

    public String getUfEscola () {
        return UfEscola;
    }

    public void setDependAdmEscola (int aux) {
        DependAdmEscola = aux;
    }

    public int getDependAdmEscola () {
        return DependAdmEscola;
    }

    public void setLocalizacEscola (int aux) {
        LocalizacEscola = aux;
    }

    public int getLocalizacEscola () {
        return LocalizacEscola;
    }

    public void setSitFuncEscola (int aux) {
        SitFuncEscola = aux;
    }

    public int getSitFuncEscola () {
        return SitFuncEscola;
    }

    public void setCodMunicProva (int aux) {
        CodMunicProva = aux;
    }

    public int getCodMunicProva () {
        return CodMunicProva;
    }

    public void setNomeMunicProva (String aux) {
        NomeMunicProva = aux;
    }

    public String getNomeMunicProva () {
        return NomeMunicProva;
    }

    public void setUfMunicProva (String aux) {
        UfMunicProva = aux;
    }

    public String getUfMunicProva () {
        return UfMunicProva;
    }

    public void setPresCiencNatur (int aux) {
        PresCiencNatur = aux;
    }

    public int getPresCiencNatur () {
        return PresCiencNatur;
    }

    public void setPresCiencHuman (int aux) {
        PresCiencHuman = aux;
    }

    public int getPresCiencHuman () {
        return PresCiencHuman;
    }

    public void setPresLinguagens (int aux) {
        PresLinguagens = aux;
    }

    public int getPresLinguagens () {
        return PresLinguagens;
    }

    public void setPresMatematica (int aux) {
        PresMatematica = aux;
    }

    public int getPresMatematica () {
        return PresMatematica;
    }

    public void setNotaCiencNatur (double aux) {
        NotaCiencNatur = aux;
    }

    public double getNotaCiencNatur () {
        return NotaCiencNatur;
    }

    public void setNotaCiencHuman (double aux) {
        NotaCiencHuman = aux;
    }

    public double getNotaCiencHuman () {
        return NotaCiencHuman;
    }

    public void setNotaLinguagens (double aux) {
        NotaLinguagens = aux;
    }

    public double getNotaLinguagens () {
        return NotaLinguagens;
    }

    public void setNotaMatematica (double aux) {
        NotaMatematica = aux;
    }

    public double getNotaMatematica () {
        return NotaMatematica;
    }

    public void setRespCiencNatur (String aux) {
        RespCiencNatur = aux;
    }

    public String getRespCiencNatur () {
        return RespCiencNatur;
    }

    public void setRespCiencHuman (String aux) {
        RespCiencHuman = aux;
    }

    public String getRespCiencHuman () {
        return RespCiencHuman;
    }

    public void setRespLinguagens (String aux) {
        RespLinguagens = aux;
    }

    public String getRespLinguagens () {
        return RespLinguagens;
    }

    public void setRespMatematica (String aux) {
        RespMatematica = aux;
    }

    public String getRespMatematica () {
        return RespMatematica;
    }

    public void setIdProvaCiencNat (int aux) {
        IdProvaCiencNat = aux;
    }

    public int getIdProvaCiencNat () {
        return IdProvaCiencNat;
    }

    public void setIdProvaCiencHum (int aux) {
        IdProvaCiencHum = aux;
    }

    public int getIdProvaCiencHum () {
        return IdProvaCiencHum;
    }

    public void setIdProvaLinguage (int aux) {
        IdProvaLinguage = aux;
    }

    public int getIdProvaLinguage () {
        return IdProvaLinguage;
    }

    public void setIdProvaMatemat (int aux) {
        IdProvaMatemat = aux;
    }

    public int getIdProvaMatemat () {
        return IdProvaMatemat;
    }

    public void setTpLingua (int aux) {
        TpLingua = aux;
    }

    public int getTpLingua () {
        return TpLingua;
    }

    public void setGabaCiencNatur (String aux) {
        GabaCiencNatur = aux;
    }

    public String getGabaCiencNatur () {
        return GabaCiencNatur;
    }

    public void setGabaCiencHuman (String aux) {
        GabaCiencHuman = aux;
    }

    public String getGabaCiencHuman () {
        return GabaCiencHuman;
    }

    public void setGabaLinguagens (String aux) {
        GabaLinguagens = aux;
    }

    public String getGabaLinguagens () {
        return GabaLinguagens;
    }

    public void setGabaMatematica (String aux) {
        GabaMatematica = aux;
    }

    public String getGabaMatematica () {
        return GabaMatematica;
    }

    public void setSituacaoRedacao (String aux) {
        SituacaoRedacao = aux;
    }

    public String getSituacaoRedacao () {
        return SituacaoRedacao;
    }

    public void setNotaCompet1 (double aux) {
        NotaCompet1 = aux;
    }

    public double getNotaCompet1 () {
        return NotaCompet1;
    }

    public void setNotaCompet2 (double aux) {
        NotaCompet2 = aux;
    }

    public double getNotaCompet2 () {
        return NotaCompet2;
    }

    public void setNotaCompet3 (double aux) {
        NotaCompet3 = aux;
    }

    public double getNotaCompet3 () {
        return NotaCompet3;
    }

    public void setNotaCompet4 (double aux) {
        NotaCompet4 = aux;
    }

    public double getNotaCompet4 () {
        return NotaCompet4;
    }

    public void setNotaCompet5 (double aux) {
        NotaCompet5 = aux;
    }

    public double getNotaCompet5 () {
        return NotaCompet5;
    }

    public void setNotaRedacao (double aux) {
        NotaRedacao = aux;
    }

    public double getNotaRedacao () {
        return NotaRedacao;
    }
}
