---
name: 🐛 버그 리포트
about: 버그를 발견하셨나요? 상세히 알려주세요!
title: "[BUG] "
labels: bug, needs-triage
assignees: ''
---

## 📋 버그 요약
<!-- 버그를 한 줄로 요약해주세요 -->

## 🎯 영향 범위
- [ ] 🔴 Critical - 서비스 전체 장애 / 데이터 손실
- [ ] 🟠 Major - 주요 기능 동작 불가
- [ ] 🟡 Minor - 일부 기능 오동작 (우회 가능)
- [ ] 🟢 Trivial - UI/UX 이슈, 오타 등

## 📍 영향받는 서비스
<!-- 해당되는 서비스를 모두 체크해주세요 -->
- [ ] 🚪 API Gateway (`api-gateway`)
- [ ] 👤 User Service (`user-service`)
- [ ] 📦 Product Service (`product-service`)
- [ ] 🛒 Order Service (`order-service`)
- [ ] 📨 Kafka (이벤트 처리)
- [ ] 🔧 Common 모듈

## 🐛 버그 상세 설명
<!-- 버그에 대해 명확하고 간결하게 설명해주세요 -->

### 증상
<!-- 어떤 문제가 발생하나요? -->

### 에러 메시지 / 로그
```
<!-- 에러 메시지나 관련 로그를 붙여넣어주세요 -->
```

### 스택 트레이스
<details>
<summary>전체 스택 트레이스 보기</summary>

```java
// 스택 트레이스를 여기에 붙여넣어주세요
```

</details>

## 📋 재현 단계
<!-- 버그를 재현하는 단계를 상세히 작성해주세요 -->

### 사전 조건
<!-- 버그 재현에 필요한 사전 상태 -->
- 예: 사용자가 로그인된 상태
- 예: 특정 상품이 등록되어 있어야 함

### 재현 절차
1. 
2. 
3. 

### 재현 빈도
- [ ] 항상 재현됨 (100%)
- [ ] 자주 재현됨 (50% 이상)
- [ ] 가끔 재현됨 (50% 미만)
- [ ] 한 번만 발생함

### 테스트 데이터 / API 요청
```bash
# 재현에 사용한 API 요청
curl -X POST http://localhost:8080/api/... \
  -H "Content-Type: application/json" \
  -d '{
    "key": "value"
  }'
```

## ✅ 기대 동작
<!-- 정상적으로 동작했을 때 어떤 결과를 기대하셨나요? -->

### 기대한 응답
```json
{
  "success": true,
  "data": { },
  "message": "기대한 메시지"
}
```

## ❌ 실제 동작
<!-- 실제로 어떤 일이 발생했나요? -->

### 실제 응답
```json
{
  "success": false,
  "error": { },
  "message": "실제 에러 메시지"
}
```
