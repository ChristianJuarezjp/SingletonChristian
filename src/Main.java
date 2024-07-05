public class Main {
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();


        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        System.out.println("URL Servidor: " + config.getServerUrl());
        System.out.println("Número Puerto: " + config.getPort());
    }
}