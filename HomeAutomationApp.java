class AutomationController {
    private static AutomationController instance;

    private AutomationController() { }

    public static synchronized AutomationController getInstance() {
        if (instance == null) {
            instance = new AutomationController();
        }
        return instance;
    }

    public void initiateSystem() {
        System.out.println("Home automation system initiated.");
    }
}

class LightSource {
    private final String hue;
    private final int level;
    private final String status;

    private LightSource(Configurator config) {
        this.hue = config.hue;
        this.level = config.level;
        this.status = config.status;
    }

    public static class Configurator {
        private String hue;
        private int level = 0; // Valor predeterminado
        private String status = "OFF"; // Valor predeterminado

        public Configurator(String hue) {
            this.hue = hue;
        }

        public Configurator setLevel(int level) {
            this.level = level;
            return this;
        }

        public Configurator setStatus(String status) {
            this.status = status;
            return this;
        }

        public LightSource build() {
            return new LightSource(this);
        }
    }

    @Override
    public String toString() {
        return "LightSource{" +
                "hue='" + hue + '\'' +
                ", level=" + level +
                ", status='" + status + '\'' +
                '}';
    }
}

class HomeSystemFacade {
    private final AutomationController controller;
    private LightSource light;

    public HomeSystemFacade() {
        this.controller = AutomationController.getInstance();
    }

    public void setupLighting(String hue, int level, String status) {
        this.light = new LightSource.Configurator(hue)
                .setLevel(level)
                .setStatus(status)
                .build();
    }

    public void activateSystem() {
        controller.initiateSystem();
        System.out.println("Configuring " + light);
    }
}

public class HomeAutomationApp {
    public static void main(String[] args) {
        HomeSystemFacade home = new HomeSystemFacade(); // 🏠 Usamos el facade para simplificar
        home.setupLighting("White", 75, "ON");
        home.activateSystem();
    }
}
