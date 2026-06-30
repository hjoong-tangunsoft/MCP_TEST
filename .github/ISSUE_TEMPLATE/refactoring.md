---
name: ♻️ 리팩토링 / 코드 개선
about: 코드 품질 개선, 리팩토링, 기술 부채 해결을 제안해주세요
title: "[REFACTOR] "
labels: refactoring, tech-debt
assignees: ''
---

## 📋 리팩토링 요약
<!-- 리팩토링 대상과 목적을 한 줄로 요약해주세요 -->

## 🎯 우선순위 제안
- [ ] 🔴 Critical - 시스템 안정성/보안에 직접적 영향
- [ ] 🟠 High - 개발 생산성에 큰 영향
- [ ] 🟡 Medium - 코드 품질 개선
- [ ] 🟢 Low - 점진적 개선 가능

## 📍 대상 범위
<!-- 리팩토링 대상 서비스/모듈을 체크해주세요 -->
- [ ] 🚪 API Gateway (`api-gateway`)
- [ ] 👤 User Service (`user-service`)
- [ ] 📦 Product Service (`product-service`)
- [ ] 🛒 Order Service (`order-service`)
- [ ] 📨 Kafka (이벤트 처리)
- [ ] 🔧 Common 모듈
- [ ] 🏗️ 빌드/설정 (Gradle, Docker 등)

## 🔍 리팩토링 유형
- [ ] 📦 코드 구조 개선 (패키지, 클래스 분리/통합)
- [ ] 🔄 중복 코드 제거
- [ ] 📝 네이밍 개선
- [ ] ⚡ 성능 최적화
- [ ] 🧹 불필요한 코드 정리 (Dead Code)
- [ ] 🔧 설정/의존성 정리
- [ ] 🧪 테스트 코드 개선
- [ ] 📚 문서화 개선
- [ ] 🛡️ 보안 취약점 해결
- [ ] 🏛️ 아키텍처 개선

## 🐛 현재 문제점

### 문제가 되는 코드 위치
```
예: user-service/src/main/java/com/example/userservice/service/UserService.java
```

### 현재 코드 (Before)
```java
// 현재 문제가 있는 코드 예시
public class SomeClass {
    // 문제 코드
}
```

### 문제점 분석
<!-- 현재 코드의 문제점을 상세히 설명해주세요 -->

#### 코드 스멜 (Code Smells)
- [ ] 긴 메서드 (Long Method)
- [ ] 큰 클래스 (Large Class)
- [ ] 과도한 주석 (Comments)
- [ ] 중복 코드 (Duplicated Code)
- [ ] 죽은 코드 (Dead Code)
- [ ] 매직 넘버/스트링 (Magic Numbers)
- [ ] God Class
- [ ] Feature Envy
- [ ] 기타: 

#### 구체적인 문제 설명
1. 
2. 
3. 

## 💡 개선 제안

### 개선된 코드 (After)
```java
// 개선된 코드 예시
public class ImprovedClass {
    // 개선된 코드
}
```

### 개선 효과
| 항목 | Before | After |
|-----|--------|-------|
| 코드 라인 수 |        |       |
| 복잡도 (Cyclomatic) |        |       |
| 테스트 커버리지 |        |       |
| 가독성 |        |       |

### 적용할 리팩토링 기법
<!-- 사용할 리팩토링 패턴이나 기법 -->
- [ ] Extract Method
- [ ] Extract Class
- [ ] Move Method
- [ ] Rename
- [ ] Introduce Parameter Object
- [ ] Replace Conditional with Polymorphism
- [ ] 기타: 
