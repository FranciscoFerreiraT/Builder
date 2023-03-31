public class main {
    public static void main(String[] args) {

        Pizza personalizada = new BuilderPizza()        
            .setTamano(1)
            .setCebolla(false) 
            .setPina(true)
            .setChampinones(true)
            .setExtraQueso(false)
            .build();

            Pizza personalizada2 = new BuilderPizza()
            .setTamano(2)
            .setSinGluten(true)
            .setJamon(true)
            .setCebolla(true)
            .setRelleno(true)
            .setSalsa(true)
            .build();
            
            System.out.println(personalizada.toString());
            System.out.println(personalizada2.toString());


            



       
    





        
    }
}
