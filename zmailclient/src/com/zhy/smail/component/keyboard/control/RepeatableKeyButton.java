package com.zhy.smail.component.keyboard.control;

/*******************************************************************************
 * Copyright (c) 2016 comtel2000
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided with
 * the distribution.
 *
 * 3. Neither the name of the comtel2000 nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import javafx.animation.Animation.Status;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.MouseButton;
import javafx.util.Duration;

class RepeatableKeyButton extends KeyButton {

  private final static Log logger = LogFactory.getLog(RepeatableKeyButton.class);

  private final long REPEAT_DELAY = 40;

  RepeatableKeyButton() {
    super();
    getStyleClass().add("repeatable-button");
  }

  @Override
  protected void initEventListener(long delay) {

    buttonDelay = new Timeline(new KeyFrame(Duration.millis(delay), event -> {
      fireShortPressed();
      buttonDelay.playFrom(buttonDelay.getCycleDuration().subtract(Duration.millis(REPEAT_DELAY)));
    }));

    setOnDragDetected(e -> {
      logger.trace(getKeyCode()+" drag detected");
      buttonDelay.stop();
      e.consume();
    });

    setOnMousePressed(e -> {
      logger.trace(getKeyCode()+" pressed" );
      if (e.getButton().equals(MouseButton.PRIMARY)) {
        if (!isMovable()) {
          fireShortPressed();
        }
        buttonDelay.playFromStart();
      }
      e.consume();
    });

    setOnMouseReleased(e -> {
      logger.trace(getKeyCode()+" released" );
      if (isMovable() && buttonDelay.getStatus() == Status.RUNNING) {
        fireShortPressed();
      }
      buttonDelay.stop();
      setFocused(false);
      e.consume();
    });

  }

}
