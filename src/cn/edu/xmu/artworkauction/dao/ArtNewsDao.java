package cn.edu.xmu.artworkauction.dao;

import java.util.List;

import cn.edu.xmu.artworkauction.entity.ArtNews;

/*
 *  ArtNewsDao 对艺术资讯的持久化管理
 *  @author Dany ifeifei@stu.xmu.edu.cn
 */
public interface ArtNewsDao 
{
	public List<ArtNews> getAllArtNews() throws Exception;
	public void addArtNews(ArtNews artNews);
	public void saveArtNews(ArtNews artNews);
	public void deleteArtNews(ArtNews artNews);
	public ArtNews getArtNewsById(Integer id);
	public List<ArtNews> getArtNewsByTitle(String title);
	public List<ArtNews> getArtNewsByType(String type);
	public List<ArtNews> getCheckedArtNews();
	public List<ArtNews> getUnCheckedArtNews();
	public List<ArtNews> getCheckedoutArtNews();
	public List<ArtNews> getUnCheckedoutArtNews();
}
