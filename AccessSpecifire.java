
class PrivateVariable{
    private String password = "12345@678";
}

public class AccessSpecifire {
public static void main(String[] args) {
    PrivateVariable obj = new PrivateVariable();
    System.out.println(obj.password);
}
    
}
