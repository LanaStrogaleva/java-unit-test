@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {

  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
    this.result = result;// Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
        return new Object[][] {
        {19, true},
        {10, false},
        {18, true},
        {21, true},// Заполни массив тестовыми данными и ожидаемым результатом
    };
  }
