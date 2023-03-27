public class Week8_Task2 {
        // Phương thức ném ngoại lệ
        public static void NPEx() {
            Object a = null;
            a.toString();
        }

        public static void AIOEx() {
            int[] arr = new int[2];
            arr[2] = 0;
        }

        public static void NFEEx() {
            String s = "abc";
            int i = Integer.parseInt(s);
        }

        public static void AEEx() {
            int a = 10;
            int b = 0;
            int c = a / b;
        }

        public static void IAEx() {
            String s = null;
            String t = s.toUpperCase();
        }

        // Phương thức bắt ngoại lệ
        public static String NPExTest() {
            try {
                NPEx();
                return "Không có lỗi";
            } catch (NullPointerException e) {
                return "Lỗi Null Pointer";
            }
        }

        public static String AIOExTest() {
            try {
                AIOEx();
                return "Không có lỗi";
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Lỗi Vượt quá giới hạn mảng";
            }
        }

        public static String NFEExTest() {
            try {
                NFEEx();
                return "Không có lỗi";
            } catch (NumberFormatException e) {
                return "Lỗi Định dạng số";
            }
        }

        public static String AEExTest() {
            try {
                AEEx();
                return "Không có lỗi";
            } catch (ArithmeticException e) {
                return "Lỗi Tính toán";
            }
        }

        public static String IAExTest() {
            try {
                IAEx();
                return "Không có lỗi";
            } catch (IllegalArgumentException e) {
                return "Lỗi Tham số không hợp lệ";
            }
        }
    }

