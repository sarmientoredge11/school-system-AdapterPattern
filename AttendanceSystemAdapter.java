public class AttendanceSystemAdapter implements SchoolManagementApp {


    private final AttendanceSystem AttendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem AttendanceSystem)
    {this.AttendanceSystem = AttendanceSystem;}

    @Override
    public void integrateSystem(){AttendanceSystem.markAttendance();}

}
