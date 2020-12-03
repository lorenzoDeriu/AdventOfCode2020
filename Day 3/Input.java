public class Input {
	private final String[] data = {
		".##.#.........#.....#....#...#.",
		".#.#.#...#.......#.............",
		"......#..#....#.#...###.......#",
		".......###......#.....#..##..#.",
		"..#...##.......#.......###.....",
		"....###.#....###......#....#..#",
		"......#..#....#...##...........",
		"..#..#....#...#.....####.......",
		"...#........#.#.......#..#...#.",
		"......#...#........#...#..##...",
		"#..#........#............#...##",
		"..#..#.#....#...........#...###",
		"#.#..#...........#.##.#.#....#.",
		".#.#....#...##.....#...........",
		".....##....#...#..............#",
		"...#....#...#.#.#.#...#........",
		"#....#....#.#.#..#....#..#..#..",
		".................#..#.....#....",
		"#..###...#.#..#.#......#.......",
		"...#..........#......#....#....",
		".#.#.........##..#.......#...#.",
		".#..........#...#..#...........",
		"....##.#.......................",
		".......#...........#...#.......",
		"...#...#..##...#....###..#....#",
		"....#.#.....##...##.#.#........",
		"...........#.#..#.#......#..#..",
		".....#.....#....#...#........#.",
		"..#......#..#.........#.....#..",
		".........................#...#.",
		"#...#...#....#........##....#..",
		"#..#.#.............#..........#",
		".#.........#.....#..#.#.#..#.#.",
		"#...#..#.......####.#....##....",
		"##...##..#.#.#...#.#.....#..#.#",
		".#..#....#.##........#...#....#",
		"#...#..##.#....##..#..#.#......",
		".#........#.....#.#....##.##.#.",
		"...#...#........#..#.##.##.....",
		"....................#.#.#.#...#",
		"..####.#..##...#....#.....##...",
		"#......#.....#.#......#.#..#.##",
		"..#.....#..#...........##.#....",
		"#....#........#............#...",
		"..##....#..............#......#",
		"..#......#.#.......####......#.",
		"..............##....#....##.#..",
		".#...............#....#....#.#.",
		"..#.#.#..#.......##.#..........",
		".#...#.......#.#....#.##.......",
		".....#.##...#...........#.#....",
		"..#.#..#...#..##...#.#.......##",
		".#.....#....#.#......#.#.......",
		"....##.........#.#.............",
		".......##.......#..............",
		"..........#......#......#....##",
		"..##.....#..#.#..........#.....",
		"...#....#.......#....##........",
		".......#...........#...........",
		"...#.#......#.#........#....#..",
		".....#...........#.#.#...#.#..#",
		".#.#...#.#.#..........#.....###",
		"#........#...#.................",
		"...##.....#.....#..#..#.......#",
		"......##...........#..#....##..",
		".........#............##...#...",
		".....#.....##...##.............",
		".#....#..#.#.#.#...#..#..#.....",
		".....#..#.#..#....#..#.........",
		"....#.....#......#...#.........",
		"#..#..#.................#......",
		".###.....#...#.#........##.#...",
		"..#...#....#.##..#.....#.#....#",
		"..#...##.................#.#...",
		"....##..........#..#..#..#....#",
		"....#..##....##.....#.#....#...",
		".#.#.#.....##........#.##..##.#",
		"....#..#......#..#........#....",
		".......#.....###.#....#.......#",
		"#....#.......#......##.#.......",
		".##.#.........#.#..##..#....##.",
		"......#........#.#....#...#....",
		".####.....#.........#.#......##",
		"##....#......#....#..#.#....##.",
		"...........###.#.....#..#......",
		".......#...........#...........",
		"........###....#..#.#..........",
		"....#........#......#..........",
		".........#......#..............",
		"...#...............#......#...#",
		"....#..##...#.........#...#....",
		"##........#.#....#......###....",
		"....#.......................#..",
		"#................#.#..#......##",
		"...#.#.....#...#...........#.##",
		".#....#.##......#...##.#....#..",
		"#...#....#..............#..#..#",
		".......#....#.##............#.#",
		".....#.#.......#.#...#.........",
		"...#.....#..##...##...#........",
		"..#.......#..####..#..#...#....",
		"#.#................##...##.#..#",
		".....#.....##.#.....#......#..#",
		"....#.#...#.........#.........#",
		"..#......#............#.....#..",
		".....#..........#.#..#..##...##",
		"........#................#.#...",
		"#...#.#....##...###...#.#......",
		".............##.#..##..........",
		"#..#......#...........#......#.",
		"#.#....#..........#.##....###..",
		".............#.........#....#..",
		"#........#..#.#..#...#....#....",
		"..............#..............##",
		".....#...#..............#.##...",
		"#...##..#...........#..........",
		"..#....#...#.#........#..#.#..#",
		"..##......#...............#....",
		"....#...#..###..#......###.#...",
		".......##..#.#........#....#...",
		"..##...#.......#...#...........",
		".#.......#.....#.#...##..#....#",
		".............#.......#.#.#....#",
		"#.......#..#..#...#.#......##..",
		"#.##..#..#..#....##.#...###.#.#",
		"...##...#..#..#........#.#..#..",
		"#....##........................",
		"##...#...#......#.#.....#..#...",
		"......#............#....#......",
		"#......#.......#.......##.#....",
		"..................#..#..#.#....",
		"..#..................##.#......",
		"..##........#.#.....##..#..#.#.",
		"#....#..............#....####..",
		"#..#..........................#",
		"..#.#.#.#....#.......#....#.#..",
		".....#.#........#..........#.#.",
		"........#.....#.......#........",
		"#.....#....#.###.....#.......#.",
		".....##.#...#.#..#...#.#.#.....",
		"......##...#.#...##..........#.",
		".#............#.....#..#....#..",
		".#................#.#..#.......",
		"....................##...##....",
		"#.......##...#.....#..#........",
		".##....#.#.#.#...........#...#.",
		"..#.#..#.#.........#...........",
		"...#......#.....#...##.........",
		"..........#.#.....###.#........",
		".............#.....##..........",
		".........#...####........#.####",
		"...................#....#......",
		".....#.........#.#....#..#...#.",
		".##...#.......##.#...#.#.#..#..",
		".....##........#....#...#.##.#.",
		"#...#...#.#....#..............#",
		"#..#.##.............#..........",
		"..#...#..#.#.##..............##",
		"#......#.#...##..........#.##..",
		".##.#...#...#.........#.#......",
		"......#........##.#..#.........",
		"#..#.......#......#.#..#.#.....",
		".#..#...........#.#.##.....#...",
		".....................#..#.#....",
		"........#...##......#.....##...",
		"#.............#...##....##....#",
		"#.#...........#....##.#......##",
		".....#.....#.#..........###..#.",
		"....#...#....##....#..##.......",
		".#....#....#.......#.#.....#...",
		".#...#.......##...##........#..",
		"......##.......#.##.#.###......",
		"....##.......#......#..........",
		"...................#..##.......",
		"......................#...##...",
		"...##....#.#..#..#.............",
		".#......##..........#...#......",
		"....##..#....#..#...#...####.#.",
		"...#.......#.......#........#.#",
		"#.........#..#...#...##...#.#.#",
		"....#...#.......#...#....#.....",
		"...#.....#.##..##.#.......##.##",
		".......#....#........#.........",
		".....#...#....#..#....#....#...",
		".##....#...#........#...#.#...#",
		".......##............#..#...#..",
		"#.#...#....#......#.#..........",
		".#.##...........#........#.....",
		".#....#.............#.#.##.....",
		"#.......###..#...###.........#.",
		"#..#.#.......#.........#...#..#",
		"..........#......#........#...#",
		".#.#...#.##.......##...........",
		".....#.........#.....#.........",
		".........#.........#....##.#..#",
		".#.......##..##..#.....#...#...",
		".#.....##...#..#..............#",
		"..##...#..#..#.#...#..........#",
		".#.......####......#......####.",
		"##..##........#.....#........#.",
		"..##.#..#.#....................",
		"...........#..#...##....##.....",
		"..#.#........#.........#....##.",
		"..#...#..##..###.#..###........",
		"......#..#.............#..##...",
		".##.........#.#..#...#.##.###..",
		".#...............#...........#.",
		".#....#........#....#........##",
		"..#####.#.#..#.#........##...#.",
		"###....#....#...#..............",
		".....#...##............#...#...",
		"##...........##.#.##.....#.....",
		"..............#..#.....#...#...",
		"...................#...........",
		"#..........##.........#........",
		"...#.........#..#.....#..#..#..",
		"....###.#......#......##....#..",
		"#......#..........#...#........",
		"...#.#...#..#..........##......",
		".....##.....#.#............##..",
		"..#..#.###....#.#.#...##....#..",
		"...#........#....##.......#....",
		".#.............#..##.......#...",
		"..#.#..###..#.....#...##.......",
		".........#......##...#.#..#....",
		".............#....##....#.#....",
		"#..#...#....#.#...#......##....",
		".............#.#......#.....###",
		"#.##....#........#.............",
		".....#...#.####...#.....#......",
		"....#....###....##.......#.....",
		"..#....##..#....#.#.......#....",
		"...#.....#....#.........#......",
		".#......#.#....#.#........#....",
		".......#......#.....#.#..#.....",
		"#......#.........##.##.#...#...",
		"..#.###...................#....",
		"....#..#....##.#........#....#.",
		"...........#..........#......#.",
		".#..#.#...###..........#..#...#",
		"...#...##..#....#...#..........",
		".#........#.................##.",
		"....#.......##....#...#........",
		"#.#...##.##...#.#.......#...#..",
		".....#.#.##.#......#..#..##....",
		".....##...#.#.....#...#........",
		"#.#.......#..#..........##.....",
		"................#......#..#.#.#",
		"#......#...#...................",
		"...#.....##.#.........#.#..#..#",
		"...#..##..##.......#....#......",
		"....##...#....#..#...........#.",
		"..#..#......#...#..#...........",
		"...#.##....#...##.......#......",
		".......#....#..#..##..#..#....#",
		".#.................#.#...#.##..",
		".....#..................#..#.#.",
		"...#......##...#...........#...",
		"..#.........#....#..#...#.....#",
		"..#...#.....#.........##.#.....",
		".....#.#....##...............#.",
		"....#...#............#.........",
		".....#.....###............#....",
		"..#.#.#.......#....#...........",
		"...........##...##...#.......#.",
		".........###.#......#..........",
		".#.......#....#.....#.##..#...#",
		"..#..................#..###....",
		"..#....#...#......##.........#.",
		"........#..#........#.........#",
		".#..#......#.........#.........",
		"...#..##.....#....#....#.....#.",
		"......#.#............###.....##",
		".......#........#.......#.#....",
		"..#.............#..............",
		".............##..#.#.#....#....",
		".................#....#.#......",
		"##..#.#.......#....#.....#.....",
		".##............##.#.......#.#..",
		"#..#...........##......#.......",
		".##......#####..##.#....#.#....",
		".......##.....#...#........#...",
		".#.#.....##....#..#....#..#...#",
		"............##.#.....##.#......",
		"........##...###.#......#......",
		"......#..#.#...#..#............",
		".........#...........#......#..",
		".#.........#............##.....",
		".#..#..#...#.#.............#...",
		"......#.#..##...#.#...........#",
		"#.##.......#...#.........#.....",
		".....#..#............#....##...",
		".#......#........#.............",
		"..#...#....#..#.......###......",
		"....#.......###.#.#...........#",
		".............#...##............",
		".##.#.#.#...........#...#....#.",
		"............##.........#......#",
		"...............#......#...#....",
		"...#.....#..###..#...........#.",
		".#........#.....##........#.#..",
		"....#.#.......#..#..#...##.#.#.",
		".......##...........#...#......",
		"....#.#..##......#.......#.....",
		"..#........#.#......#.#........",
		"........#....#..#....#..##.....",
		".#.........##..........#.#.....",
		"..##...##.....##......##..#....",
		".###.....##...........##.#...##",
		"...#................#.......#..",
		"#.......#.#.#..#.#.##..#...#...",
		".#.#.......#..#................",
		"..#.#.#......#............#....",
		"#.....#.###..#.#...#...........",
		"#...........#..........#.#.#.##",
		"..#.#...#......##.....#........",
		"........#.......#.#...#...#....",
		"..#..........#......###......#.",
		"..........##.#....#.....#.##...",
		"..#.....#......#.........#..##.",
		".#...#........#..#.#..#...##..#",
		"..###........#......#.#........",
		"..#.##.#....#.#....#.#...#.....",
	};

	public String getData(int position) {
		return data[position];
	}

	public int getLength() {
		return data.length;
	}
}
