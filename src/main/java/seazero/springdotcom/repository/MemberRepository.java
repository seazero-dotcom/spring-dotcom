package seazero.springdotcom.repository;

import seazero.springdotcom.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원을 저장하면 저장된 회원이 반환 됨
    // Optional은 java8에 들어간 기능
    // findById나 findByName을 할 때 값이 얿으면 null로 반환 되겠죠
    // 요즘에는 null로 그냥 반환하는 방법 대신에 Optional로 감싸서 반환하는 방식을 선호한다.
    Optional<Member> findById(Long id); // id 로 회원을 찾는 것
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 지금까지 저장된 모든 회원 리스트를 반환해줌
}
