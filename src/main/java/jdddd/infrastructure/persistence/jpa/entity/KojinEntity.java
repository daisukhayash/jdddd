package jdddd.infrastructure.persistence.jpa.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the "kojin" database table.
 * 
 */
@Entity
@Table(name = "\"kojin\"")
@NamedQuery(name = "KojinEntity.findAll", query = "SELECT k FROM KojinEntity k")
public class KojinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private KojinEntityPK id;

	private String カナ氏名;

	private String カナ名;

	private String 外国人カナ通称名;

	private String 外国人通称名;

	private String 漢字氏名;

	private String 漢字名;

	private String 現住所;

	private String 現住所異動事由コード;

	private String 現住所枝番３コード;

	private String 現住所枝番コード;

	private String 現住所住定日;

	private String 現住所小枝番コード;

	private String 現住所町名コード;

	private String 現住所届出日;

	private String 現住所番地コード;

	private String 現住所方書;

	private String 現住所方書コード;

	private String 作成更新時間;

	private String 作成更新日;

	private String 住民事由コード;

	private String 住民届出日;

	private String 住民日;

	private String 世帯番号;

	private String 性別;

	private String 生年月日;

	private String 続柄１;

	private String 続柄２;

	private String 続柄３;

	private String 続柄４;

	private String 登録生年月日;

	private String 和暦生年月日;

	public KojinEntity() {
	}

	public KojinEntityPK getId() {
		return this.id;
	}

	public void setId(KojinEntityPK id) {
		this.id = id;
	}

	public String getカナ氏名() {
		return this.カナ氏名;
	}

	public void setカナ氏名(String カナ氏名) {
		this.カナ氏名 = カナ氏名;
	}

	public String getカナ名() {
		return this.カナ名;
	}

	public void setカナ名(String カナ名) {
		this.カナ名 = カナ名;
	}

	public String get外国人カナ通称名() {
		return this.外国人カナ通称名;
	}

	public void set外国人カナ通称名(String 外国人カナ通称名) {
		this.外国人カナ通称名 = 外国人カナ通称名;
	}

	public String get外国人通称名() {
		return this.外国人通称名;
	}

	public void set外国人通称名(String 外国人通称名) {
		this.外国人通称名 = 外国人通称名;
	}

	public String get漢字氏名() {
		return this.漢字氏名;
	}

	public void set漢字氏名(String 漢字氏名) {
		this.漢字氏名 = 漢字氏名;
	}

	public String get漢字名() {
		return this.漢字名;
	}

	public void set漢字名(String 漢字名) {
		this.漢字名 = 漢字名;
	}

	public String get現住所() {
		return this.現住所;
	}

	public void set現住所(String 現住所) {
		this.現住所 = 現住所;
	}

	public String get現住所異動事由コード() {
		return this.現住所異動事由コード;
	}

	public void set現住所異動事由コード(String 現住所異動事由コード) {
		this.現住所異動事由コード = 現住所異動事由コード;
	}

	public String get現住所枝番３コード() {
		return this.現住所枝番３コード;
	}

	public void set現住所枝番３コード(String 現住所枝番３コード) {
		this.現住所枝番３コード = 現住所枝番３コード;
	}

	public String get現住所枝番コード() {
		return this.現住所枝番コード;
	}

	public void set現住所枝番コード(String 現住所枝番コード) {
		this.現住所枝番コード = 現住所枝番コード;
	}

	public String get現住所住定日() {
		return this.現住所住定日;
	}

	public void set現住所住定日(String 現住所住定日) {
		this.現住所住定日 = 現住所住定日;
	}

	public String get現住所小枝番コード() {
		return this.現住所小枝番コード;
	}

	public void set現住所小枝番コード(String 現住所小枝番コード) {
		this.現住所小枝番コード = 現住所小枝番コード;
	}

	public String get現住所町名コード() {
		return this.現住所町名コード;
	}

	public void set現住所町名コード(String 現住所町名コード) {
		this.現住所町名コード = 現住所町名コード;
	}

	public String get現住所届出日() {
		return this.現住所届出日;
	}

	public void set現住所届出日(String 現住所届出日) {
		this.現住所届出日 = 現住所届出日;
	}

	public String get現住所番地コード() {
		return this.現住所番地コード;
	}

	public void set現住所番地コード(String 現住所番地コード) {
		this.現住所番地コード = 現住所番地コード;
	}

	public String get現住所方書() {
		return this.現住所方書;
	}

	public void set現住所方書(String 現住所方書) {
		this.現住所方書 = 現住所方書;
	}

	public String get現住所方書コード() {
		return this.現住所方書コード;
	}

	public void set現住所方書コード(String 現住所方書コード) {
		this.現住所方書コード = 現住所方書コード;
	}

	public String get作成更新時間() {
		return this.作成更新時間;
	}

	public void set作成更新時間(String 作成更新時間) {
		this.作成更新時間 = 作成更新時間;
	}

	public String get作成更新日() {
		return this.作成更新日;
	}

	public void set作成更新日(String 作成更新日) {
		this.作成更新日 = 作成更新日;
	}

	public String get住民事由コード() {
		return this.住民事由コード;
	}

	public void set住民事由コード(String 住民事由コード) {
		this.住民事由コード = 住民事由コード;
	}

	public String get住民届出日() {
		return this.住民届出日;
	}

	public void set住民届出日(String 住民届出日) {
		this.住民届出日 = 住民届出日;
	}

	public String get住民日() {
		return this.住民日;
	}

	public void set住民日(String 住民日) {
		this.住民日 = 住民日;
	}

	public String get世帯番号() {
		return this.世帯番号;
	}

	public void set世帯番号(String 世帯番号) {
		this.世帯番号 = 世帯番号;
	}

	public String get性別() {
		return this.性別;
	}

	public void set性別(String 性別) {
		this.性別 = 性別;
	}

	public String get生年月日() {
		return this.生年月日;
	}

	public void set生年月日(String 生年月日) {
		this.生年月日 = 生年月日;
	}

	public String get続柄１() {
		return this.続柄１;
	}

	public void set続柄１(String 続柄１) {
		this.続柄１ = 続柄１;
	}

	public String get続柄２() {
		return this.続柄２;
	}

	public void set続柄２(String 続柄２) {
		this.続柄２ = 続柄２;
	}

	public String get続柄３() {
		return this.続柄３;
	}

	public void set続柄３(String 続柄３) {
		this.続柄３ = 続柄３;
	}

	public String get続柄４() {
		return this.続柄４;
	}

	public void set続柄４(String 続柄４) {
		this.続柄４ = 続柄４;
	}

	public String get登録生年月日() {
		return this.登録生年月日;
	}

	public void set登録生年月日(String 登録生年月日) {
		this.登録生年月日 = 登録生年月日;
	}

	public String get和暦生年月日() {
		return this.和暦生年月日;
	}

	public void set和暦生年月日(String 和暦生年月日) {
		this.和暦生年月日 = 和暦生年月日;
	}

}