/*
 * Copyright (c) 2023-2024 jwdeveloper jacekwoln@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.jwdeveloper.tiktok.data.events.control;

import io.github.jwdeveloper.tiktok.annotations.*;
import io.github.jwdeveloper.tiktok.data.events.common.TikTokLiveClientEvent;
import io.github.jwdeveloper.tiktok.data.requests.*;
import lombok.*;


@Getter
@EventMeta(eventType = EventType.Control)
public class TikTokPreConnectionEvent extends TikTokLiveClientEvent
{
	private final LiveUserData.Response userData;
	private final LiveData.Response roomData;
	@Setter boolean cancelConnection = false;
	@Setter String reason = "TikTokPreConnectionEvent cancelled connection!";

	public TikTokPreConnectionEvent(LiveUserData.Response userData, LiveData.Response liveData) {
		this.userData = userData;
		this.roomData = liveData;
	}

	public void setCancelConnection(boolean cancelConnection, String reason) {
		this.cancelConnection = cancelConnection;
		this.reason = reason;
	}
}