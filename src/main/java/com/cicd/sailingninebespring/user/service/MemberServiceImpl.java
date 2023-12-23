package com.cicd.sailingninebespring.user.service;

import com.cicd.sailingninebespring.user.domain.MemberDTO;
import com.cicd.sailingninebespring.user.entity.Member;
import com.cicd.sailingninebespring.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final ModelMapper modelMapper;

    private final MemberRepository memberRepository;
    @Override
    public Member getUserDetail(Long userId) {
        return null;
    }

    @Override
    public Long createUser(MemberDTO member) {
        Member memberF = modelMapper.map(member, Member.class);

        memberRepository.save(memberF);

        return memberF.getUserId();
    }
}
