public class testeJogador {
    public static void main(String[] args) {
    Time time = new Time("Flamengo", "Sr Waldemar", new Jogador[3]);

    Jogador j1 = new Jogador("Ronaldinho", 46, "Meia");
    Jogador j2 = new Jogador("Didico", 44, "Atacante");
    Jogador j3 = new Jogador("Arraxca", 31, "Meia");
    
    time.adicionarJogador(j1);
    time.adicionarJogador(j2);
    time.adicionarJogador(j3);
    
    System.err.println(time.getNome());
    time.listarJogadores();
}

    

}
