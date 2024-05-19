package com.jakeodell.runnerz.run;

import java.time.LocalDateTime;

public record Run(Integer id,
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime competedOn,
                  Integer miles,
                  Location location
) {}
