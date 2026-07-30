# Given an array of meeting time interval objects consisting of start and end times
# [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), determine
# if a person could add all meetings to their schedule without any conflicts.

# The intervals may be provided in any order.
# Note: (0,8),(8,10) is not considered a conflict at 8

def can_attend_meetings(intervals: list[list[int]]) -> bool:
    # Sort meetings by their starting time.
    intervals.sort(key=lambda interval: interval[0])

    # Compare each meeting with the previous meeting.
    for i in range(1, len(intervals)):
        previous_end = intervals[i - 1][1]
        current_start = intervals[i][0]

        # The current meeting starts before the previous one ends.
        if current_start < previous_end:
            return False

    return True