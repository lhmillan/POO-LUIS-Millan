public class Medico extends PlanoSaude {
    protected String crm;
    protected String nome;

    public Medico(String empresa, String crm, String nome) {
        super(empresa);
        this.crm = crm;
        this.nome = nome;
    }

    @Override
    public String toString() {
       
        return super.toString() + "CRM: "+crm + "Nome do médico: " + nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPagamento() {
        return valorPago = super.calcularPagamento() * 1.10;
        //aqui o médico ganha mais 10%, SÓ ele ganha esse valor
        // Estamos modificando o método original
    }

}
