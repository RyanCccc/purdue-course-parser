/*
 * Predefined.java
 * 
 * The MIT License
 *
 * Copyright (c) 2013 Kaiwen Xu and Rendong Chen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is furnished 
 * to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */

package net.kevxu.purdueassist.course.elements;

public class Predefined {

	public enum Term {
		CURRENT("Current", "CURRENT"), FALL2013("Fall 2013", "201410"), SUMMER2013(
				"Summer 2013", "201330"), SPRING2013("Spring 2013", "201320"), FALL2012(
				"Fall 2012", "201310"), SUMMER2012("Summer 2012", "201230"), SPRING2012(
				"Spring 2012", "201220"), FALL2011("Fall 2011", "201210"), SUMMER2011(
				"Summer 2011", "201130"), SPRING2011("Spring 2011", "201120"), FALL2010(
				"Fall 2010", "201110"), SUMMER2010("Summer 2010", "201030"), SPRING2010(
				"Spring 2010", "201020"), FALL2009("Fall 2009", "201010"), SUMMER2009(
				"Summer 2009", "200930"), SPRING2009("Spring 2009", "200920"), FALL2008(
				"Fall 2008", "200910"), SUMMER2008("Summer 2008", "200830"), SPRING2008(
				"Spring 2008", "200820");

		private final String name;
		private final String linkName;

		Term(String name, String linkName) {
			this.name = name;
			this.linkName = linkName;
		}

		public String getName() {
			return name;
		}

		public String getLinkName() {
			return linkName;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public enum Subject {
		AAE("Aero & Astro Engineering"), AAS("African American Studies"), ABE(
				"Agri & Biol Engineering"), AD("Art & Design"), AFT(
				"Aerospace Studies"), AGEC("Agricultural Economics"), AGR(
				"Agriculture"), AGRY("Agronomy"), AMST("American Studies"), ANSC(
				"Animal Sciences"), ANTH("Anthropology"), ARAB("Arabic"), ASAM(
				"Asian American Studies"), ASL("American Sign Language"), ASM(
				"Agricultural Systems Mgmt"), ASTR("Astronomy"), AT(
				"Aviation Technology"), BAND("Bands"), BCHM("Biochemistry"), BCM(
				"Bldg Construct Mgmt Tech"), BIOL("Biological Sciences"), BME(
				"Biomedical Engineering"), BMS("Basic Medical Sciences"), BTNY(
				"Botany & Plant Pathology"), BUS("Business"), CAND("Candidate"), CE(
				"Civil Engineering"), CEM("Construction Engr & Mgmt"), CGT(
				"Computer Graphics Tech"), CHE("Chemical Engineering"), CHM(
				"Chemistry"), CHNS("Chinese"), CLCS("Classics"), CLPH(
				"Clinical Pharmacy"), CMPL("Comparative Literature"), CNIT(
				"Computer & Info Tech"), COM("Communication"), CPB(
				"Comparative Pathobiology"), CS("Computer Sciences"), CSR(
				"Consumer ScI & Retailing"), DANC("Dance"), EAS(
				"Earth & Atmospheric Sci"), ECE("Electrical & Computer Engr"), ECET(
				"Electrical&Comp Engr Tech"), ECON("Economics"), EDCI(
				"Educ-Curric & Instruction"), EDPS("Educ-Ed'l and Psy Studies"), EDST(
				"Ed Leadrship&Cultrl Fnd"), EEE("Environ & Ecological Engr"), ENE(
				"Engineering Education"), ENGL("English"), ENGR(
				"First Year Engineering"), ENTM("Entomology"), ENTR(
				"Entrepreneurship"), EPCS("Engr Proj Cmity Service"), FLL(
				"Foreign Lang & Literatures"), FNR("Forestry&Natural Resources"), FR(
				"French"), FS("Food Science"), FVS("Film And Video Studies"), GEP(
				"Global Engineering Program"), GER("German"), GRAD(
				"Graduate Studies"), GREK("Greek"), GS("General Studies"), HDFS(
				"Human Dev &Family Studies"), HEBR("Hebrew"), HHS(
				"College Health & Human Sci"), HIST("History"), HK(
				"Health And Kinesiology"), HONR("Honors"), HORT("Horticulture"), HSCI(
				"Health Sciences"), HTM("Hospitality & Tourism Mgmt"), IDE(
				"Interdisciplinary Engr"), IDIS("Interdisciplinary Studies"), IE(
				"Industrial Engineering"), IET("Industrial Engr Technology"), IPPH(
				"Industrial & Phys Pharm"), IT("Industrial Technology"), ITAL(
				"Italian"), JPNS("Japanese"), JWST("Jewish Studies"), LA(
				"Landscape Architecture"), LALS("Latina Am&Latino Studies"), LATN(
				"Latin"), LC("Languages and Cultures"), LCME(
				"Lafayette Center Med Educ"), LING("Linguistics"), MA(
				"Mathematics"), MARS("Medieval &Renaissance Std"), MCMP(
				"Med Chem &Molecular Pharm"), ME("Mechanical Engineering"), MET(
				"Mechanical Engr Tech"), MFET("Manufacturing Engr Tech"), MGMT(
				"Management"), MSE("Materials Engineering"), MSL(
				"Military Science & Ldrshp"), MUS("Music History & Theory"), NRES(
				"Natural Res & Environ Sci"), NS("Naval Science"), NUCL(
				"Nuclear Engineering"), NUPH("Nuclear Pharmacy"), NUR("Nursing"), NUTR(
				"Nutrition Science"), OBHR("Orgnztnl Bhvr &Hum Resrce"), OLS(
				"Organiz Ldrshp&Supervision"), PES("Physical Education Skills"), PHAD(
				"Pharmacy Administration"), PHIL("Philosophy"), PHPR(
				"Pharmacy Practice"), PHRM("Pharmacy"), PHYS("Physics"), POL(
				"Political Science"), PSY("Psychology"), PTGS("Portuguese"), REG(
				"Reg File Maintenance"), REL("Religious Studies"), RUSS(
				"Russian"), SA("Study Abroad"), SCI("General Science"), SLHS(
				"Speech, Lang&Hear Science"), SOC("Sociology"), SPAN("Spanish"), STAT(
				"Statistics"), TECH("Technology"), THTR("Theatre"), USP(
				"Undergrad Studies Prog"), VCS("Veterinary Clinical Sci"), VM(
				"Veterinary Medicine"), WOST("Women's Studies"), YDAE(
				"Youth Develop & Ag Educ"), CIC("CIC"), CMCI("CMCI"), AST("AST"), CHEM(
				"CHEM"), CSCI("CSCI"), COMM("COMM"), ENG("ENG"), GEOL("GEOL"), LSTU(
				"LSTU"), FINA("FINA"), SPCH("SPCH"), INFO("INFO"), MATH("MATH"), CMCL(
				"CMCL"), GEOG("GEOG"), JOUR("JOUR"), COAS("COAS"), HPER("HPER"), HSRV(
				"HSRV"), POLS("POLS"), SPEA("SPEA"), TEL("TEL"), CIT("CIT"), EALC(
				"EALC"), SWK("SWK"), ANAT("ANAT"), CJUS("CJUS"), PHYT("PHYT"), PMTD(
				"PMTD"), DRAF("DRAF"), PRDM("PRDM"), SUPV("SUPV"), ERTH("ERTH"), FOLK(
				"FOLK"), CMLT("CMLT"), OADM("OADM"), NMCM("NMCM"), PHSL("PHSL");

		private final String fullName;

		Subject(String fullName) {
			this.fullName = fullName;
		}

		public String getFullName() {
			return fullName;
		}

		@Override
		public String toString() {
			return fullName;
		}
	}

	public enum Type {
		DistanceLearning("Distance Learning", "DIS"), IndividualStudy(
				"Individual Study", ""), Laboratory("Laboratory", "LAB"), Lecture(
				"Lecture", "LEC"), Recitation("Recitation", "REC"), PracticeStudyObservation(
				"Practice Study Observation", "PSO"), LaboratoryPreparation(
				"Laboratory Preparation", ""), Experiential("Experiential", ""), Research(
				"Research", ""), Studio("Studio", ""), Lab1("Lab1", ""), Clinic(
				"Clinic", ""), Lecture1("Lecture1", ""), Presentation(
				"Presentation", ""), TravelTime("TravelTime", ""), Experiential1(
				"Experiential1", ""), Clinic1("Clinic1", ""), Clinic2(
				"Clinic2", ""), Clinic3("Clinic3", ""), Studio1("Studio1", "");

		private final String name;
		private final String linkName;

		Type(String name, String linkName) {
			this.name = name;
			this.linkName = linkName;
		}

		public String getName() {
			return name;
		}

		public String getLinkName() {
			return linkName;
		}

		@Override
		public String toString() {
			return name;
		}
	}
}
