# KIỂM THỬ HỘP ĐEN
## Sinh viên
- Họ và tên: Nguyễn Việt Hoàng
- Mã sinh viên: 20020196
## Bài toán
- Trên một mảnh đất có một khu vực nguy hiểm nơi đặt bẫy mìn của quân đội. Có một người bất kì đang đứng tại mảnh đất đó hãy xác định xem người này có đang ở trong khu vực nguy hiểm không ?
Biết khi chiếu toàn bộ hệ vật lên trục toạ độ đề các ta có toàn bộ khu đất là hình chữ nhật được giới hạn bởi 4 đường thẳng x = 1, x = 5, y = -2, y = 7  
trong đó khu vực nguy hiểm là hình được giới hạn bới 4 đường thẳng x = 2, x = 3.5, y = 0, y = 5
và người đang cần xác định là một điểm có toạ độ (x,y)
## Kiểm thử
### 1. Kiểm thử giá trị biên
|STT|x|y|Actual Output|Expected Output|
|---|---|---|---|---|
|1|3.0|2.5|True|True|
|2|1.0|2.5|False|False|
|3|1.01|2.5|False|False|
|4|4.99|2.5|False|False|
|5|5.0|2.5|False|False|
|6|3.0|-2.0|False|False|
|7|3.0|-1.99|False|False|
|8|3.0|6.99|False|False|
|9|3.0|7.0|False|False|
### 2. Kiểm thử phân hoạch tương đương theo giá trị đầu ra
|STT|x|y|Actual Output|Expected Output|
|---|---|---|---|---|
|1|4.0|3.0|False|False|
|2|2.5|3.5|True|True|
|3|1.5|-|False|False|
|4|3|6|False|False|
