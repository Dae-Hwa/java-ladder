# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

## 구현할 기능 목록

### 사다리 게임 실행
- 실행 결과 입력
    - 쉼표로 구분

- 사다리 결과
    - 게임 진행하여 결과 저장
    - 참가자 id로 조회
    - 전체 조회

### 입, 출력
- 실행 결과 입력
    - `실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)`

- 사다리 실행 결과 출력
    - 개인 별 이름 입력 시 개인별 결과 출력
    - all 입력 시 전체 참여자의 실행 결과 출력 
    ```
    사다리 결과
    
    pobi  honux crong   jk
        |-----|     |-----|
        |     |-----|     |
        |-----|     |     |
        |     |-----|     |
        |-----|     |-----|
    꽝    5000  꽝    3000
    
    결과를 보고 싶은 사람은?
    pobi
    
    실행 결과
    꽝
    
    결과를 보고 싶은 사람은?
    all
    
    실행 결과
    pobi : 꽝
    honux : 3000
    crong : 꽝
    jk : 5000
    ```
## 구현된 기능 목록

### 사다리 생성
- 사다리 게임 참가자 이름 입력
    - 최대 5글자 까지 가능
    - 쉼표로 구분
    
- 입력받은 높이에 따라 생성
렁이 생성됩니다
- 사다리 가로 라인이 겹치면 안됨
    - |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### 입, 출력
- 참여할 사람 이름 입력
    - `참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)`

- 사다리 높이 입력
    - `최대 사다리 높이는 몇 개인가요?`
    
- 실행결과 
    ```
    실행결과
    
    pobi  honux crong   jk
        |-----|     |-----|
        |     |-----|     |
        |-----|     |     |
        |     |-----|     |
        |-----|     |-----|
    ```

 