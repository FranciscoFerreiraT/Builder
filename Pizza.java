public class Pizza {

   
    private String tipoMasa;
    private boolean relleno;
    private int tamano;
    private boolean salsa;

    
    @Override
    public String toString() {
        return "Pizza [tipoMasa=" + tipoMasa + ", relleno=" + relleno + ", tamano=" + tamano + ", salsa=" + salsa
                + ", tipoSalsa=" + tipoSalsa + ", cebolla=" + cebolla + ", sinGluten=" + sinGluten + ", extraQueso="
                + extraQueso + ", pina=" + pina + ", champinones=" + champinones + ", jamon=" + jamon + "]";
    }

    private int tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pina;
    private boolean champinones;
    private boolean jamon;

  
    public static final String masaFina = "masa fina";
    public static final String masaPan = "mas pan";
    public static final String masaIntegral = "integral";


  
    public static final int pequena = 0;
    public static final int mediana = 1;
    public static final int familiar = 2;

   
    public static final int salsaBarbacoa = 0;
    public static final int salsaTomate = 1;
    public static final int salsaSinGluten = 2;
    
     
   
    public Pizza(){
        this.tipoMasa = masaFina;
        this.relleno = false;
        this.tamano = mediana;
        this.salsa = true;
        this.cebolla = false;
        this.sinGluten = false;
        this.extraQueso = true;
        this.pina = true;
        this.champinones = true;
        this.jamon = true;
    }

 
     * @param tipoMasa
     * @param relleno
     * @param tamano
     * @param salsa
     * @param tipoSalsa
     * @param cebolla
     * @param sinGluten
     * @param extraQueso
     * @param pina
     * @param champinones
     * @param jamon
     */

     
    public Pizza(String tipoMasa, boolean relleno, int tamano, boolean salsa, int tipoSalsa, boolean cebolla, boolean sinGluten, 
    boolean extraQueso, boolean pina, boolean champinones, boolean jamon ){
        this.tipoMasa = tipoMasa;
        this.relleno = relleno;
        this.tamano = tamano;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pina = pina;
        this.champinones = champinones;
        this.jamon = jamon;        
    }

 

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public void setPina(boolean pina) {
        this.pina = pina;
    }

    public void setChampinones(boolean champinones) {
        this.champinones = champinones;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

  

    public String getTipoMasa() {
        return tipoMasa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public boolean isPina() {
        return pina;
    }

    public boolean isChampinones() {
        return champinones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public static String getMasafina() {
        return masaFina;
    }

    public static String getMasapan() {
        return masaPan;
    }

    public static String getMasaintegral() {
        return masaIntegral;
    }

    public static int getPequena() {
        return pequena;
    }

    public static int getMediana() {
        return mediana;
    }

    public static int getFamiliar() {
        return familiar;
    }

    public static int getSalsabarbacoa() {
        return salsaBarbacoa;
    }

    public static int getSalsatomate() {
        return salsaTomate;
    }

    public static int getSalsasingluten() {
        return salsaSinGluten;
    }

    

























    
}