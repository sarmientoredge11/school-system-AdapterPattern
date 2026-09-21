public class SchoolSystem {
    public static void main(String[] args){

        SchoolManagementApp attSystem = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp grdSystem = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp lbrSystem = new LibrarySystemAdapter(new LibrarySystem());

        attSystem.integrateSystem();
        System.out.println();
        grdSystem.integrateSystem();
        System.out.println();
        lbrSystem.integrateSystem();
        System.out.println();

    }
}