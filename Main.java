public class Main {
    public static void main(String[] args) {
        // Tạo mảng Employee[] gồm cả hai loại nhân sự
        Employee[] employees = new Employee[] {
            new FullTimeEmployee("NV01", "An", 10000000, 2000000),
            new Intern("NV02", "Bình", 5000000, "Đại học CNTT")
        };

        double totalSalary = 0;

        // Vòng lặp in tên, salary() và cộng dồn quỹ lương (Không dùng if hay instanceof)
        for (Employee emp : employees) {
            double empSalary = emp.salary();
            System.out.printf("Nhân viên %s: %,.0f đ\n", emp.getName(), empSalary);
            totalSalary += empSalary;
        }

        System.out.printf("Tổng quỹ lương in ra: %,.0f đ\n", totalSalary);
    }
}