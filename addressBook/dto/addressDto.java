package dto;

// Data Transfer Object, VO(value object)
public class addressDto {
    // 서류철에서 한개의 데이터
    public String name;
    private int age;
    public String phone;
    public String address;
    public String memo;

    public addressDto() {
    }

    public addressDto(String name, int age, String phone, String address, String memo) {
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.memo = memo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String toString() {
        return "addressDto [name : " + name + ", age : " + age + ", phone : " + phone + ", address : " + address + ", memo : " + memo + "]";
    }
}
