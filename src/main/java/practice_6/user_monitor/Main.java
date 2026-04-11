package practice_6.user_monitor;

public class Main {
    static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("177");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");

        userMonitor.printSessions();
    }
}
