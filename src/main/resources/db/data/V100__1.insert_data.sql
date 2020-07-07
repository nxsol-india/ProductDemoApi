
INSERT INTO `product` (`id`, `name`, `description`, `author`, `discount`, `price`, `price_currency`, `category_id`) VALUES ('1', 'Stock Trading & Investing for Beginners 4-in-1 Course Bundle ', 'Jumpstart your Stock Trading & Investing journey as Beginners in Stock Market. Learn both financial & technical analysis ', 'Indian Insight', '10', '700', 'INR', '1');
INSERT INTO `product` (`id`, `name`, `description`, `author`, `discount`, `price`, `price_currency`, `category_id`) VALUES ('2', 'The Complete Financial Analyst Course 2020', 'Excel, Accounting, Financial Statement Analysis, Business Analysis, Financial Math, PowerPoint: Everything is Included! ', 'Max', '20', '1500', 'INR', '2');
INSERT INTO `product` (`id`, `name`, `description`, `author`, `discount`, `price`, `price_currency`, `category_id`) VALUES ('3', 'Advanced CSS and Sass: Flexbox, Grid, Animations and More! ', 'The most advanced and modern CSS course on the internet: master flexbox, CSS Grid, responsive design, and so much more. ', 'John Doe', '18', '1800', 'INR', '3');

INSERT INTO `category` (`id`, `name`) VALUES ('1', 'Business');
INSERT INTO `category` (`id`, `name`) VALUES ('2', 'Finace');
INSERT INTO `category` (`id`, `name`) VALUES ('3', 'Web Development');


INSERT INTO `country` (`id`, `name`) VALUES ('1', 'India');
INSERT INTO `country` (`id`, `name`) VALUES ('2', 'USA');

INSERT INTO `tax` (`id`, `exclusive_tax`, `country_id`) VALUES ('1', '18', '1');
INSERT INTO `tax` (`id`, `exclusive_tax`, `country_id`) VALUES ('2', '0', '2');
