package api.utils.dto.users;

import lombok.Getter;

import java.util.List;

@Getter
public class Users {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public List<UserInfo> data;
    public Support support;
}
