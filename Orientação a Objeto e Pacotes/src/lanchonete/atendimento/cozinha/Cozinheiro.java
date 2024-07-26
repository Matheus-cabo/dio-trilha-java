package lanchonete.atendimento.cozinha;



public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural Hamburguer no balcão");
    }
    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando Suco no Balcão");
    }
    //pode ser default 
    public void  adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche tipo HAMBURGUER");
    }
    private void prepararVitamina(){
        System.out.println("Preparando  Suco");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();    
    }
    private void selecionarIngredienteslanche(){
        System.out.println("Selecionando o Pão, Salada, Ovo e Carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando Fruta, Leite e Suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando Ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo Vitamina Liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a Carne e Ovo para o HAMBURGUER");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    } 
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }     
}   
