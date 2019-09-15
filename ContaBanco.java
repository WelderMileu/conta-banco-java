package contabanco;
public class ContaBanco {
    public static void main(String[] args) {
        
        Clients c1 = new Clients();
        c1.setDono("Paulo");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.mostrar();
        
        Clients c2 = new Clients();
        c2.setDono("Joelma");
        c2.abrirConta("CP");
        c2.sacar(10);
        c2.sacar(40);
        c2.fecharConta();
        c2.mostrar();
        
        Clients c3 = new Clients();
        c3.setDono("Julia");
        c3.abrirConta("CI");
        c3.depositar(20);
        c3.mostrar();
        
    }
    
}
