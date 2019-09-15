package contabanco;
public class Clients {
    private String dono;
    private String tipo;
    private boolean status;
    private double saldo;

    public Clients() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void mostrar(){ // return the results
        System.out.println("-----------------------------------");
        System.out.println("Dono Conta:    "+ this.getDono());
        System.out.format("Saldo Conta:   %.2f", this.getSaldo());
        System.out.println("\nTipo de Conta: "+ this.getTipo());
        System.out.println("Status conta:  "+ this.getStatus());
        System.out.println("\n");
    }
    
    public void abrirConta(String e){
        if("CP".equals(e)){
            System.out.println(this.getDono()+" Seja Bem vindo(a) ao nosso Banco");
            this.setSaldo(50);
            this.setTipo(e);
            this.setStatus(true);
        }else if("CC".equals(e)){
            System.out.println(this.getDono()+" Seja Bem vindo(a) ao nosso Banco");
            this.setSaldo(150);
            this.setTipo(e);
            this.setStatus(true);
        }else{
            System.out.println("Nao foi possival criar conta");
        }
    }
    
    public void fecharConta(){
        if(this.getStatus() == true){
            if(this.getSaldo() < 0){
                System.out.println("Conta em debito não foi possivel fecha-la");
            }else if(this.getSaldo() > 0){
                System.out.println("Conta com saldo não foi possivel fechar-la");
            }else if(this.getSaldo() == 0){
                this.setStatus(false);
                System.out.println("Conta desativada com sucesso");
            }
        }
    }
    
    public void depositar(double e){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + e);
        }else{
            System.out.println("Não foi possivel realizar \nessa operação pois sua conta se \nencontra inativa");
        }
    }
    
    public void sacar(double e){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - e);
        }else{
            System.out.println("Não foi possivel realizar \nessa operação pois sua conta se \nencontra inativa");
        }
    }
    // Getrs e Setrs
    
    public void setDono(String e){
        this.dono = e;     
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setTipo(String e){
        this.tipo = e;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    private void setSaldo(double e){
        this.saldo = e;
    }
    
    private double getSaldo(){
        return this.saldo;
    }
    
    private void setStatus(boolean e){
        this.status = e;
    }
    
    private boolean getStatus(){
        return this.status;
    }
}
