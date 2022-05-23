package seazero.springdotcom.repository;

import seazero.springdotcom.domain.Member;

import java.util.List;
import java.util.Optional;

// MemoryMemberRepository : MemberRepository의 구현체
// implements MemberRepository쓰고 빨간 밑줄 생기면 alt+enter로 import하면 아래에 다 오버라이드 생김
public class MemoryMemberRepository implements MemberRepository {

    //save 할 때 저장해야하니까 저장 할 곳 만들어준다.
    //private static Map<Long, Member> st

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
