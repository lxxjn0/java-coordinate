# 🧮 java-coordinate

> 좌표 계산기 미션을 진행하는 Repository

<br/>

## 1. enum 실습

### 기능 구현 목록

- 다음 코드에서 2, 3, 4 대신에 enum을 적용

  ```java
  ...
  static {
      creators.put(2, new LineCreator());
      creators.put(3, new TriangleCreator());
      creators.put(4, new RectangleCreator());
  }
  ...
  ```

<br/>

## 2. exception 실습

### 기능 구현 목록

- Point 생성자의 IllegalArgumentException을 RuntimeException(Unchecked Exception)으로 변경

- FigureFactory의 getFigure() 메소드의 IllegalArgumentException을 CompileTimeException(Checked Exception)으로 변경

- Point 생성자와 FigureFactory의 getFigure() 메소드에서 throw하는 Exception을 main에서 catch해 예외처리

<br/>

## 3. 원시 값 포장 실습

### 기능 구현 목록

- Point의 x, y값에 해당하는 int 값을 새로운 객체로 포장

- Point의 x, y값을 포장한 객체를 1 ~ 24의 값을 미리 생성한 후 재사용 가능한 구조로 변경

<br/>

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
