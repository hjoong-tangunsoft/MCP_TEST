---
name: ✨ 기능 요청
about: 새로운 기능을 제안해주세요!
title: "[FEATURE] "
labels: enhancement, needs-triage
assignees: ''
---

## 📋 기능 요약
<!-- 제안하는 기능을 한 줄로 요약해주세요 -->

## 🎯 우선순위 제안
- [ ] 🔴 Critical - 비즈니스 핵심 기능, 즉시 필요
- [ ] 🟠 High - 중요 기능, 빠른 시일 내 필요
- [ ] 🟡 Medium - 유용한 기능, 일정에 맞춰 개발
- [ ] 🟢 Low - 있으면 좋은 기능, 여유 있을 때 개발

## 📍 대상 서비스
<!-- 이 기능이 추가될 서비스를 체크해주세요 -->
- [ ] 🚪 API Gateway (`api-gateway`)
- [ ] 👤 User Service (`user-service`)
- [ ] 📦 Product Service (`product-service`)
- [ ] 🛒 Order Service (`order-service`)
- [ ] 📨 Kafka (이벤트 처리)
- [ ] 🔧 Common 모듈
- [ ] 🆕 새로운 서비스 필요

## 💡 제안 배경

### 현재 문제점 / Pain Point
<!-- 현재 어떤 문제가 있거나 불편한 점이 있나요? -->

### 비즈니스 가치
<!-- 이 기능이 제공하는 비즈니스 가치는 무엇인가요? -->
- 예: 사용자 경험 개선
- 예: 처리 시간 단축
- 예: 비용 절감

### 영향받는 사용자/시스템
<!-- 이 기능의 혜택을 받을 사용자나 시스템은? -->
- 예: 모든 앱 사용자
- 예: 관리자
- 예: 다른 마이크로서비스

## 🎯 기능 상세 설명
<!-- 원하는 기능에 대해 상세하게 설명해주세요 -->

### 사용자 스토리 (User Story)
```
As a [사용자 유형],
I want [원하는 기능],
So that [기대 효과/이유].
```

### 주요 기능
<!-- 핵심 기능을 나열해주세요 -->
1. 
2. 
3. 

## 📝 상세 요구사항

### 기능 요구사항 (Functional Requirements)
- [ ] FR-1: 
- [ ] FR-2: 
- [ ] FR-3: 

### 비기능 요구사항 (Non-Functional Requirements)
- [ ] NFR-1: 성능 - 예: API 응답 시간 < 200ms
- [ ] NFR-2: 확장성 - 예: 동시 사용자 1000명 지원
- [ ] NFR-3: 보안 - 예: 인증/인가 필요

### 수용 조건 (Acceptance Criteria)
<!-- 기능이 완성되었다고 판단할 수 있는 조건 -->
```gherkin
Given [초기 상태]
When [사용자 행동]
Then [기대 결과]
```

## 🔌 API 설계 (해당되는 경우)

### 새로운 API 엔드포인트
```
POST /api/v1/resource
GET /api/v1/resource/{id}
PUT /api/v1/resource/{id}
DELETE /api/v1/resource/{id}
```

### 요청 예시
```json
{
  "field1": "value1",
  "field2": "value2"
}
```

### 응답 예시
```json
{
  "success": true,
  "data": { },
  "message": "성공 메시지"
}
```
