INSERT INTO badge(badge_id, name, slug) VALUES ('8','Top 10 worldwide','top-10-worldwide-8');
INSERT INTO badge(badge_id, name, slug) VALUES ('9','Top 50 worldwide','top-50-worldwide-9');

INSERT INTO region_area (id, name, slug) VALUES ('168', 'United Kingdom', 'united-kingdom-168');

INSERT INTO region_group (id, name, slug, region_area_id) VALUES ('169', 'Solicitors', 'solicitors-169', '168');

INSERT INTO region(id, name, slug, region_group_id) VALUES ('170', 'London', 'london-170', '169');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('960', 'Allen & Overy', 'allen--overy-960', 'https://via.placeholder.com/150', 'http://allen--overy-960.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('4220', 'Osborne Clarke', 'osborne-clarke-4220', 'https://via.placeholder.com/150', 'http://osborne-clarke-4220.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('6339', 'Slater and Gordon', 'slater-and-gordon-6339', 'https://via.placeholder.com/150', 'http://slater-and-gordon-6339.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('11229', 'BDB Pitmans', 'bdb-pitmans-11229', 'https://via.placeholder.com/150', 'http://bdb-pitmans-11229.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('13185', 'Leigh Day', 'leigh-day-13185', 'https://via.placeholder.com/150', 'http://leigh-day-13185.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('13837', 'Michelmores', 'michelmores-13837', 'https://via.placeholder.com/150', 'http://michelmores-13837.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('15467', 'Sackers', 'sackers-15467', 'https://via.placeholder.com/150', 'http://sackers-15467.com');

INSERT INTO firm(firm_id, name, slug, image_url, website_url)
VALUES ('15630', 'Fletchers', 'fletchers-15630', 'https://via.placeholder.com/150', 'http://fletchers-15630.com');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('988', false, 'GLOBAL', 709, 753, '170', '960');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('4248', false, 'GLOBAL', 350, 70, '170', '4220');
--UPDATE firm_region SET region_id = 170 where id = 4248;

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('6367', false, 'LOCAL', 793, 766, '170', '6339');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('11257', false, 'GLOBAL', 442, 141, '170', '11229');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('13213', false, 'LOCAL', 654, 366, '170', '13185');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('13865', false, 'GLOBAL', 216, 795, '170', '13837');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('15495', false, 'GLOBAL', 470, 719, '170', '15467');

INSERT INTO firm_region(firm_region_id, booking, cross_border_capability,
client_satisfaction_rating, expertise_and_reputation_rating, region_id, firm_id)
VALUES ('15658', false, 'GLOBAL', 928, 221, '170', '15630');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (19859, 'STABLE_5', true, 'T_3', 0, '960');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (28091, 'STABLE_2', true, 'T_2', 0, '4220');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (30793, 'DOWN', false, 'T_1', 0, '6339');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (36274, 'STABLE_2', true, 'T_1', 0, '11229');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (42084, 'DOWN', false, 'T_1', 0, '13185');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (44716, 'STABLE_4', true, 'T_3', 0, '13837');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (46179, 'STABLE_1', false, 'T_3', 0, '15467');

INSERT INTO firm_ranking(firm_ranking_id, trend, diversity, tier, position, firm_firm_id)
VALUES (47747, 'STABLE_3', true, 'T_2', 0, '15630');
