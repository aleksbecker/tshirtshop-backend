package com.turing.tshirtshop.api.payload;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class AssignUsersRequest {

	List<String> userIds;

	public List<String> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
}
