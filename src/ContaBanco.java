public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    protected String dono;
    private float saldo;
    private boolean status;

    //métodos personalzados

    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc" ) { //cc = conta corrente
            //this.saldo = 50;
            this.setSaldo(50);
        } else if(tipo == "cp") { //cp = conta polpança
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo()>0) {
            System.out.println("Existe saldo na conta, conta não pode ser fechada");
        } else if(this.getSaldo()<0) {
            System.out.println("Existe um débito na conta, conta não pode ser fechada");
           
        } else{
                this.setStatus(false);
                System.out.println("Conta fechada/finalizada com sucesso! ");
            }
        
    }
    public void depositar(float valor) {
        if(this.getStatus()==true) {
            this.setSaldo(this.getSaldo() + valor);
            //this.Saldo = this.saldo + saldo(valor depositado)
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else{
            System.out.println("Impossivel depositar pois sua conta ainda nao foi aberta");
        }
        
    }
    public void sacar(float valor) {
        if(this.getStatus()==true){
            if(this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel depositar pois sua conta ainda nao foi aberta ");
        }
    }   
    public void pagarMensalidade() {
        int vm = 0; //vm valor mensal
        if(getTipo() == "cc"){
            vm = 12;
        } else if(this.getTipo() == "cp"){
            vm = 20;
        } 
        if(this.getStatus() == true){
            if(this.getSaldo()>vm){
                this.setSaldo(this.getSaldo() - vm);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                } else{
                     System.out.println("saldo insuficiente para pagar a mensalidade");
                 }   
            } else{
            System.out.println("Impossivel depositar pois sua conta ainda nao foi aberta");
        }
    }

    //métodos especiais
    public ContaBanco() {
        this.setSaldo(0);//this.saldo = 0; 
        this.setStatus(false);// this.status = false;
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
