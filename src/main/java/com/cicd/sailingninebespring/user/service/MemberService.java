package com.cicd.sailingninebespring.user.service;

import com.cicd.sailingninebespring.user.domain.MemberDTO;
import com.cicd.sailingninebespring.user.entity.Member;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberService {

    Member getUserDetail(Long userId);
    Long createUser(MemberDTO member);
}
