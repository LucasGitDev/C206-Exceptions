import fetin.Organizacao;

public class Main {

    static Organizacao org;
    public static void main(String[] args) {
        criaProjeto("RankME", "99.0");
        org = new Organizacao();
        criaProjeto("RankME", "99.0");
        criaProjeto("HelperBot", "Noventa negativo");
        criaProjeto("HelperBot", "90.0");
        criaProjeto("Inacoin", "99.0");
        criaProjeto("Inacoin", "5.0");
        criaProjeto("Inacoin2.0", "1000000.0");
        criaProjeto("Inacoin2.0", "100.0");

        org.showProjetos();
    }

    public static void criaProjeto(String nome, String nota){
        try{
            org.addProjeto(nome, nota);
        }catch (Exception e){
            if (e instanceof NullPointerException) System.out.println("Organizacao não foi criada!");
            else System.out.println(e.getMessage());
        }
    }
}