# Circular buffer
### 1. Data structure ? (Internal)
+ Array of String
### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean
+ setSize(int): void
### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test case
* TC01 => is_buffer_still_have_space_to_write()
* TC02 => set_size_to_20()
* TC03 => 1 commit
* TC04 => 1 commit
* TC05 => 1 commit