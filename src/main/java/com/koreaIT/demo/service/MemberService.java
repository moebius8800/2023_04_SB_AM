package com.koreaIT.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreaIT.demo.repository.ArticleRepository;
import com.koreaIT.demo.vo.Member;

@Service
public class MemberService {
	
	private ArticleRepository articleRepository;
	
	@Autowired
	public MemberService(MemberRepository MemberRepository) {
		this.memberRepository = memberRepository;
	}
	
	public void writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);
	}
	
	public int getLastInsertId() {
		return articleRepository.getLastInsertId();
	}
	
	public Member getArticleById(int id) {
		return MemberRepository.getMemberById(id);
	}
	
	public List<Member> getArticles(){
		return MemberRepository.getMembers();
	}
	
	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
	}
	
	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}
	
}