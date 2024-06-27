### 1. 프로젝트 외부에 csv 폴더 생성하기
<img width="414" alt="스크린샷 2024-06-23 오후 8 46 36" src="https://github.com/uhanuu/csv-reader/assets/110734817/feb55bc7-d026-49b5-a840-4d6aa6bd3bbc">

### 2. csv 폴더안에 input.csv 파일로 저장한다.
<img width="170" alt="image" src="https://github.com/uhanuu/csv-reader/assets/110734817/86168181-808e-4188-95bb-55a24c565faf">

### 파일 형식
- 아래와 같은 순서로 저장해야 합니다.

| 섬네일 url | 뉴스테러 이름 | 뉴스레터 보낸사람 이름 | 뉴스레터 보낸사람 이메일 | 뉴스레터 소개/설명글 | 카테고리 | 해당 뉴스레터 홈페이지 링크 | 구독하기 링크 | 업로드 요일 | 담당자 | 원터치 가능 여부 | 확인 메일 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

### 3. `application.peroperties`혹은 `application.yml` 파일 설정
sprin.datasource 혹은 충돌을 방지하기 위해서 port를 입력해주세요
``` yaml
server:
  port: 8099 # 지정할 포트 번호(예시)

spring:
  datasource:
    url: 
    username: 
    password: 
    driver-class-name:
```

### 4. postman, curl 도구를 활용해서 `POST` 요청하시면 됩니다.
- request body는 존재하지 않습니다.
- 다음에 admin page를 제작하기 위해서 web으로 만들었습니다.

경로: `localhost:8099/csv`
