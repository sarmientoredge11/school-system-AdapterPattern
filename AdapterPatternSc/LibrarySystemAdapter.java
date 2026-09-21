package AdapterPatternSc;

public class LibrarySystemAdapter implements SchoolManagementApp {

    private final LibrarySystem LibrarySystem;

    public LibrarySystemAdapter(LibrarySystem LibrarySystem)
    {this.LibrarySystem = LibrarySystem;}

    @Override
    public void integrateSystem(){LibrarySystem.manageBooks();}
    }



