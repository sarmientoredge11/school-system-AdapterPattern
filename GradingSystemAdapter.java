public class GradingSystemAdapter implements SchoolManagementApp{

    private final GradingSystem GradingSystem;

    public GradingSystemAdapter(GradingSystem GradingSystem)
    {this.GradingSystem = GradingSystem;}

    @Override
    public void integrateSystem(){GradingSystem.recordGrades();}
}
