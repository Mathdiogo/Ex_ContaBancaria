public class App {
    public static void main(String[] args)  {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Matheus");
        p1.abrirConta("cc");
        

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2104);
        p2.setDono("Rayssa");
        p2.abrirConta("cp");

        p1.depositar(300);
        p2.depositar(500);

        p2.sacar(100);

        //p1.fecharConta();
        //p2.fecharConta();

        p1.pagarMensalidade();
        p2.pagarMensalidade();
        
        p1.estadoAtual();
        p2.estadoAtual();
        

    }
}
