public class SubDepartment extends DepartmentAbstract {

  public int DepartmentSize;
    public SubDepartment(int DepartmentSize){
        this.DepartmentSize=DepartmentSize;
    }
    @Override
    int getDepartmentSize() {
        return 27;
    }

    public static void main(String[] args) {

        SubDepartment subDepartment=new SubDepartment();
        int DepartmentSize=subDepartment.getDepartmentSize();

    }
}
