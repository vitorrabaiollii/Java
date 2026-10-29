public class InfoAmbiente {
    public static void main(String[] args) {
        // System.getProperties().list(System.out);
        System.out.println("nome do sistema: " +(System.getProperty("os.name")));
        System.out.println("versão do Java: " + (System.getProperty("java.version")));
        System.out.println("diretório do usuário: " + System.getProperty("user.dir"));

        // javac InfoAmbiente.java
        // java InfoAmbiente
    }
}
