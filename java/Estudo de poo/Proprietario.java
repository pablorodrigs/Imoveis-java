public class Proprietario {
    private String nome, cpf, telefone;

    public Proprietario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void PrintProp(){
        System.out.println("Nome do proprietário: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
    }
}