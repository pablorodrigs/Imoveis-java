public class Imovel {
    private String endereco;
    private int metragem;
    private double valorMercado;
    private Proprietario prop;
    private Boolean status;

    public Imovel(String endereco, int metragem, double valorMercado, Proprietario prop, String status) {
        this.endereco = endereco;
        this.metragem = metragem;
        this.valorMercado = valorMercado;
        this.prop = prop;
        if(status.equals("novo")){
            this.status = true;
        }else if(status.equals("usado")){
            this.status = false;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public Proprietario getProp() {
        return prop;
    }

    public void setProp(Proprietario prop) {
        this.prop = prop;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public double calculaM2(){
        return (getValorMercado()/getMetragem());
    }

    public void PrintIm(){
        getProp().PrintProp();
        System.out.printf("Endereço: " + getEndereco());
        if(status){
            System.out.println("Status: novo");
        }else{
            System.out.println("Status: usado");
        }
    }
}
