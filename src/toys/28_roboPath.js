// robotPath2
// 문제
// 세로와 가로의 길이가 각각 M, N인 방의 지도가 2차원 배열로 주어졌을 때, 1은 장애물을 의미하고 0 이동이 가능한 통로를 의미합니다.
// 로봇은 한 번에 임의의 k칸 직진과 90도 회전 중 1가지 동작을 할 수 있다. 
// 로봇의 현재 위치와 방향, 목표 지점과 방향이 함께 주어집니다. 
// 이 때, 방향은 위쪽이 1, 오른쪽이 2, 아래쪽이 3, 왼쪽이 4로 주어집니다. 
// 로봇이 목표 지점까지 도달해 목표 방향으로 회전하는 데 필요한 동작의 수를 리턴해야 합니다.

// +------ M ------+
// |               |
// |               |
// N               |
// |               |
// |               |
// +---------------+

//     1
// 4       2
//     3

// + K (0이 견속된 구간만큼 직진)
// 방향이 1만큼 차이난다면 (4 -> 1, 1 -> 4): +90, 방향이 2만큼 차이난다면 (2 -> 4, 1 -> 3): +180
// 0(360) 90 180 270


// 입력
// 인자 1 : room
// 배열을 요소로 갖는 배열
// room.length는 M
// room[i]는 number 타입을 요소로 갖는 배열
// room[i].length는 N
// room[i][j]는 세로로 i, 가로로 j인 지점의 정보를 의미
// room[i][j]는 0 또는 1

// 인자 2 : src
// number 타입을 요소로 갖는 배열
// src.length는 2
// src[i]는 0 이상의 정수
// src의 요소는 차례대로 좌표평면 위의 y좌표, x좌표

// 인자 3 : sDir
// number 타입의 자연수

// 인자 4 : dst
// number 타입을 요소로 갖는 배열
// dst.length는 2
// dst[i]는 0 이상의 정수
// dst의 요소는 차례대로 좌표평면 위의 y좌표, x좌표

// 출력
// number 타입을 리턴해야 합니다.
// 주의사항
// M, N은 20 이하의 자연수입니다.
// src, dst는 항상 로봇이 지나갈 수 있는 통로입니다.
// src에서 dst로 가는 경로가 항상 존재합니다.
// 목표 지점에 도달한 후 방향까지 일치해야 합니다.
// 직진은 1칸 직진이 아니라 임의의 k칸을 직진할 수 있습니다. 즉 한번의 직진 명령으로 장애물이 없는 한 계속 갈 수 있습니다.
// 왼쪽에서 오른쪽 또는 아래에서 위쪽으로 방향을 바꾸는 데 총 2번의 회전 동작이 필요합니다.

// 입출력 예시
// let room = [
//   [0, 0, 0, 0],
//   [0, 1, 1, 0],
//   [0, 1, 0, 0],
//   [0, 0, 1, 1],
// ];
// let src = [3, 0];
// let sDir = 3;
// let dst = [2, 2];
// let dDir = 2;
// let output = robotPath2(room, src, sDir, dst, dDir);
// console.log(output); // --> 11

// /*
// 1. 시작 - (3, 0)에서 아래 방향을 향한 상태
// 장애물은 x로 표시, 출발지점은 s로 표시
// [
//   [0, 0, 0, 0],
//   [0, x, x, 0],
//   [0, x, 0, 0],
//   [s, 0, x, x],
// ] 

// 2. 로봇은 아래 방향을 향하고 있음 
//   3인 이유: 위로 가기 위해서는 90도 회전이 2번, 직진 1번 필요함. 직진 한번으로 도달할 수 있는 모든 칸을 표기. 
//   2인 이유: 오른쪽으로 가기 위해서는 90도 회전 1번, 직진 1번이 필요함
// [
//   [3, 0, 0, 0],
//   [3, x, x, 0],
//   [3, x, 0, 0],
//   [s, 2, x, x],
// ] 

// 3. (0, 0) 지점에서 로봇은 위 방향을 향하고 있음 
//   5인 이유: 오른쪽으로 가기 위해서는 90도 회전이 1번, 직진 1번 필요함.
//   1인 이유: 직진 1번으로 충분
// [
//   [3, 5, 5, 5],
//   [3, x, x, 0],
//   [3, x, 0, 0],
//   [s, 2, x, x],
// ] 

// 4. 비슷한 방식으로 계산하면 최종적으로 방향 전환까지 11번이 나오게 된다.
// */

// room = [
//   [0, 0, 0, 0, 0, 0],
//   [0, 1, 1, 0, 1, 0],
//   [0, 1, 0, 0, 0, 0],
//   [0, 0, 1, 1, 1, 0],
//   [1, 0, 0, 0, 0, 0],
// ];
// src = [4, 2];
// sDir = 1;
// dst = [2, 2];
// dDir = 3;
// output = robotPath2(room, src, sDir, dst, dDir);
// console.log(output); // --> 7

const robotPath2 = function (room, src, sDir, dst, dDir) {
    // sDir: src, dDir: dst
    //     1
    // 4       2
    //     3
  
    // + K (0이 연속된 구간만큼 직진)
    // 방향이 1만큼 차이난다면 (4 -> 1, 1 -> 4): +90, 방향이 2만큼 차이난다면 (2 -> 4, 1 -> 3): +180
    // Dir 차의 절대값 만큼 +1, +2 단, 3은 (1, 4)인 경우이므로 +1로 계산 
  
    // 가로와 세로의 길이
    const R = room.length;
    const C = room[0].length;
  
    // 4가지 방향: 위(1), 오른쪽(2), 아래(3), 왼쪽(4)
    // 차례대로 [방향, 상하이동, 좌우이동]
    const MOVES = [
      [1, -1, 0], // UP
      [2, 0, 1], // RIGHT
      [3, 1, 0], // DOWN
      [4, 0, -1], // LEFT
    ];
  
    // 좌표가 유효한 좌표인지 확인하는 함수
    const isValid = (row, col) => row >= 0 && row < R && col >= 0 && col < C;
  
    // 각 위치별 최소의 동작으로 도달 가능한 경우의 방향을 저장
    const directions = [];
    // 각 위치별 최소 동작의 수를 저장. 편의상 거리(dist)로 표현
    const dist = [];
  
    for (let row = 0; row < R; row++) {
      directions.push(Array(C).fill(0));
      dist.push(Array(C).fill(Number.MAX_SAFE_INTEGER));  // 2^53 -1 !== MAX_VALUE
    }
  
    // bfs 구현을 위해 큐를 선언한다.
    const queue = Array(R * C);
    let front = 0;
    let rear = 0;
    const isEmpty = (queue) => front === rear;
    const enQueue = (queue, pos) => {
      queue[rear] = pos;
      rear++;
    };
    const deQueue = (queue) => {
      return queue[front++];
    };
  
    // 출발 지점의 좌표
    const [sRow, sCol] = src;
    directions[sRow][sCol] = sDir;
    dist[sRow][sCol] = 0;
  
    // 목표 지점의 좌표
    const [dRow, dCol] = dst;
  
    enQueue(queue, [sRow, sCol]);
    
    while (isEmpty(queue) === false) {
      const [row, col] = deQueue(queue);
      const dir = directions[row][col];
  
      for (move of MOVES) {
        const [nDir, rDiff, cDiff] = move;
        // 이동할 좌표
        const nRow = row + rDiff;
        const nCol = col + cDiff;
  
        // 유효한 좌표가 아니거나
        // 해당 좌표가 장애물(1)인 경우 건너뛴다.
        if (isValid(nRow, nCol) === false || room[nRow][nCol] === 1) continue;
  
        // 현재 위치의 방향과 목표 위치의 방향과의 차이
        const dDiff = Math.abs(nDir - dir);
        let candidate;
        if (dDiff === 0) {
          // 차이가 없는 경우
          // 출발 지점에서의 방향과 이동하려는 방향이 같은 경우
          // 직진만 하면 되지만 그러기 위해서는 1로 초기화 되어야 한다.
          candidate = dist[row][col] || 1;
        } else if (dDiff === 2) {
          // 2번 회전해야 하는 경우: 회전 2 + 직진 1
          candidate = dist[row][col] + 3;
        } else {
          // 1번만 회전해도 되는 경우: 회전 1 + 직진 1
          candidate = dist[row][col] + 2;
        }
  
        if (nRow === dRow && nCol === dCol) {
          // 다음에 도달하는 곳이 목표 지점인 경우
          // 목표 방향까지 고려해서 필요한 거리를 계산한다.
          const dDiff = Math.abs(nDir - dDir);
          if (dDiff === 0) {
            candidate = candidate;
          } else if (dDiff === 2) {
            candidate = candidate + 2;
          } else {
            candidate = candidate + 1;
          }
        }
  
        if (candidate < dist[nRow][nCol]) {
          // 유망한 좌표는 큐에 삽입한다.
          enQueue(queue, [nRow, nCol]);
          dist[nRow][nCol] = candidate;
          // 방향은 전부 같다.
          directions[nRow][nCol] = nDir;
        }
      }
    }
  
    return dist[dRow][dCol];
  };
  
  