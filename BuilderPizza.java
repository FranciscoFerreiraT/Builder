public class BuilderPizza {
   
    protected Pizza _pizza;

  
    public Pizza build (){
        return this._pizza;
    }    
     

  
    public BuilderPizza (){
        _pizza = new Pizza();
    }

  
    public BuilderPizza setTipoMasa(String tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public BuilderPizza setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizza setTamano(int tamano) {
        _pizza.setTamano(tamano);
        return this;
    }

    public BuilderPizza setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizza setTipoSalsa(int tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizza setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizza setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizza setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizza setPina(boolean pina) {
        _pizza.setPina(pina);
        return this;
    }

    public BuilderPizza setChampinones(boolean champinones) {
        _pizza.setChampinones(champinones);
        return this;
    }

    public BuilderPizza setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }


















    






}
